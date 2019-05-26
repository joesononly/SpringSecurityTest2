package test.service.permision;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import www.SpringRunApplication;
import www.bean.Responsibility;
import www.bean.View;
import www.service.permision.ViewService;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={SpringRunApplication.class},webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class ViewServiceTest {

    protected  static final Logger logger = LoggerFactory.getLogger(ViewServiceTest.class);

    //模拟MVC对象
    private MockMvc mockMvc;

    //获取上下文对象，构建MVC对象
    @Resource
    private WebApplicationContext webApplicationContext;

    @Resource
    private ViewService viewService;

    @Before
    public void before(){
        //获取mockmvc对象实例
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void findResponsibilityByViewName() {
    }

    @Test
    public void findAllViewAndResponsibility() {
        List<View> views= viewService.findAllViewAndResponsibility();

        for(View view:views)
        {
            logger.debug("视图名称为:{}",view.getName());
            for(Responsibility responsibility:view.getResponsibilities())
            {
                logger.debug("拥有该视图的职责有:{}",responsibility.getName());
            }

        }

    }
}