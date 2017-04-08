package common.utils;

/**
 * Created by Administrator on 2017/3/21.
 */
public class Commons {

//    public static final String PIC_HOST = "http://127.0.0.1:8080/file";
//    public static final String UPLOAD_PATH = "D:/git_workplace/demoWithView/src/main/webapp/upload/";
    public static final String UPLOAD_REAL_PATH = "G:/upload";
    public static final String UPLOAD_VIRT_PATH = "http://localhost:8080/upload";
    public static final Long UPLOAD_PIC_MAXSIZE = 102400L;//1024 * 1024 * 10 = 10485760
    public static final String UPLOAD_PIC_EXCEEDSIZE_ERR = "图片大小超过" + UPLOAD_PIC_MAXSIZE / 1024 + "KB";

    public static String getDirByHashAlgo(String originalFilename) {
        int hCode = originalFilename.hashCode();//获取文件名的hashCode
        //获取hCode的低4位，并转换成16进制字符串
        String dir1 = Integer.toHexString(hCode & 0xF);
        //获取hCode的低5~8位，并转换成16进制字符串
        String dir2 = Integer.toHexString(hCode >>> 4 & 0xF);
        //与文件保存目录连接成完整路径
        String subDir = "/" + dir1 + "/" + dir2;
        return subDir;
    }

}
