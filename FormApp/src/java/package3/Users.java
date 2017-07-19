/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package3;

import java.util.ArrayList;
import java.util.List;
import package4.JavaBean;

/**
 *
 * @author admin
 */
public class Users {
    public List<JavaBean> users = new ArrayList<JavaBean>();
    
    public Users() {
        users.add(new JavaBean("Ritesh", 22));
        users.add(new JavaBean("sdkjfhsj", 345));
        users.add(new JavaBean("sdkjfsd", 55));
        users.add(new JavaBean("dkfjgsd", 3));
        users.add(new JavaBean("wirywuejgf", 5354));
    }
    
    public void add(String name, int age) {
        users.add(new JavaBean(name, age));
    }
    
    public Boolean remove(int id) {
        if(id < 0 || id >= users.size())
            return false;
        users.remove(id);
        return true;
    }
}
