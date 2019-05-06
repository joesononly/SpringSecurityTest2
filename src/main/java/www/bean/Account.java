package www.bean;

import org.springframework.stereotype.Component;

@Component
public class Account {
    public String accountName;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
