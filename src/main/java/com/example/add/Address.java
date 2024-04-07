package com.example.add;

public class Address {
    public String adds;
    private String aid;

    public Address() {
    }

    public Address(String adds, String aid) {
        this.adds = adds;
        this.aid = aid;
    }

    /**
     * 获取
     * @return adds
     */
    public String getAdds() {
        return adds;
    }

    /**
     * 设置
     * @param adds
     */
    public void setAdds(String adds) {
        this.adds = adds;
    }

    /**
     * 获取
     * @return aid
     */
    public String getAid() {
        return aid;
    }

    /**
     * 设置
     * @param aid
     */
    public void setAid(String aid) {
        this.aid = aid;
    }

    public String toString() {
        return "Address{adds = " + adds + ", aid = " + aid + "}";
    }
}
