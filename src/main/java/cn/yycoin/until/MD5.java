package cn.yycoin.until;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 
 * 
 * @author xychen
 * @since 1.0
 * @version 1.0
 */
public class MD5
{
    
    private static char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    
    /**
     * MD5加密
     * 
     * @since 1.0
     * @param res
     * @return <br>
     *         <b>作者： xychen</b> <br>
     *         创建时间：Jul 25, 2011 1:31:02 PM
     */
    public static String md5(String res)
    {
        try
        {
            byte[] strTemp = res.getBytes("utf-8");
            MessageDigest mdTemp = MessageDigest.getInstance("MD5");
            mdTemp.update(strTemp);
            byte[] md = mdTemp.digest();
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++)
            {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            String dd = new String(str);
            return dd;
        }
        catch (Exception e)
        {
            return null;
        }
    }

    /**
     * MD5签名
     *
     * @param paramSrc
     *            the source to be signed
     * @return
     * @throws Exception
     */
//    public static String sign(String paramSrc) {
//        String sign = md5(paramSrc + "&key=" + PublicProperties.getValueByKey("tfb_key"));
////        System.out.println("MD5签名结果：" + sign);
//        return sign;
//    }

    /**
     * MD5验签
     *
     * @param source
     *            签名内容
     * @param sign
     *            签名值
     * @return
     */
//    public static boolean verify(String source, String tfbSign) {
//        String sign = md5(source + "&key=" + PublicProperties.getValueByKey("tfb_key"));
////        System.out.println("自签结果：" + sign);
//        return tfbSign.equals(sign);
//    }




    public static String md5_16(String res)
    {
        String md5_32String = md5(res);
        if (null != md5_32String)
        {
            return md5_32String.substring(8, 24);
        }
        return null;
    }


	private static final char HEX_DIGITS[] = { '0', '1', '2', '3', '4', '5',
			'6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

	public static String toHexString(byte[] b) { // String to byte
		StringBuilder sb = new StringBuilder(b.length * 2);
		for (int i = 0; i < b.length; i++) {
			sb.append(HEX_DIGITS[(b[i] & 0xf0) >>> 4]);
			sb.append(HEX_DIGITS[b[i] & 0x0f]);
		}
		return sb.toString();
	}

	public static String mmd5(String s) {
		try { // Create MD5 Hash
			MessageDigest digest = java.security.MessageDigest
					.getInstance("MD5");
			digest.update(s.getBytes());
			byte messageDigest[] = digest.digest();
			return toHexString(messageDigest);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return "";
	}






    public static void main(String[] args)
    {
        System.out.println(md5("123456"));
    }
}
