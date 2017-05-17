package org.ramer.diary;
import lombok.extern.slf4j.Slf4j;
import org.ramer.diary.util.Encrypt;

import org.junit.Test;

/**
 * 加密类的测试类
 * @author ramer
 *
 */
@Slf4j
public class EncryptTest{

    /**
     * 测试加密方法.
     */
    @Test
    public void testEncrypt() {
        String string = "1390635973@qq.com";
        log.debug("加密字符串： " + string);
        String encoded = Encrypt.execEncrypt(string, true);
        log.debug(encoded);
    }

}
