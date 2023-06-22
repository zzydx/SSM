package zzydx.pojo;

/**
 * @Author ZhangZengY
 * @Date 2023/6/9 23:33
 * @Package pojo
 * @Project SSM
 */
public class Emp {
    private Integer eid;
    private String empName;
    private Integer age;
    private String sex;
    private Integer did;

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", did=" + did +
                '}';
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Emp(Integer eid, String empName, Integer age, String sex, Integer did) {
        this.eid = eid;
        this.empName = empName;
        this.age = age;
        this.sex = sex;
        this.did = did;
    }

    public Emp() {
    }
}
