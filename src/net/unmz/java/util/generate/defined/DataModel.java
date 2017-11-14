package net.unmz.java.util.generate.defined;

/**
 * Project Name: 批量生成项目
 * 功能描述：动态数据模型
 *
 * @author faritor@unmz.net
 * @version 1.0
 * @date 2017-11-14 13:54
 * @since JDK 1.8
 */
public class DataModel {

    private static String businessPackage;
    private static String diverName;
    private static String url;
    private static String username;
    private static String password;
    private static String databaseName;
    private static String sourceRootPackage = "out";

    public static String getBusinessPackage() {
        return businessPackage;
    }

    public static void setBusinessPackage(String businessPackage) {
        DataModel.businessPackage = businessPackage;
    }

    public static String getDiverName() {
        return diverName;
    }

    public static void setDiverName(String diverName) {
        DataModel.diverName = diverName;
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        DataModel.url = url;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        DataModel.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        DataModel.password = password;
    }

    public static String getDatabaseName() {
        return databaseName;
    }

    public static void setDatabaseName(String databaseName) {
        DataModel.databaseName = databaseName;
    }

    public static String getSourceRootPackage() {
        return sourceRootPackage;
    }

    public static void setSourceRootPackage(String sourceRootPackage) {
        DataModel.sourceRootPackage = sourceRootPackage;
    }
}
