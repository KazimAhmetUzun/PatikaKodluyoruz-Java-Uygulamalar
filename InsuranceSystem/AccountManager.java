package InsuranceSystem;

import java.util.Date;
import java.util.TreeSet;

class AccountManager {
    private TreeSet<Account> accounts;

    public AccountManager() {
        accounts = new TreeSet<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account login(String email, String password) {
        for (Account account : accounts) {
            User user = account.getUser();
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                account.setAuthenticationStatus(AuthenticationStatus.SUCCESS);
                user.setLastLoginDate(new Date());
                return account;
            }
        }
        throw new InvalidAuthenticationException("Geçersiz kullanıcı adı veya şifre!");
    }
}
