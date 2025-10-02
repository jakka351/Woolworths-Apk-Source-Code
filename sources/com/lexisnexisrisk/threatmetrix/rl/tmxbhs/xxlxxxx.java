package com.lexisnexisrisk.threatmetrix.rl.tmxbhs;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;

/* loaded from: classes6.dex */
public class xxlxxxx extends CipherInputStream {
    public static int r00720072r0072r0072 = 5;
    public static int r0072r00720072r0072 = 1;
    public static int rr007200720072r0072 = 2;
    public static int rrr00720072r0072;

    public xxlxxxx(InputStream inputStream, Cipher cipher) {
        super(inputStream, cipher);
    }

    public static int r0072007200720072r0072() {
        return 20;
    }

    @Override // javax.crypto.CipherInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() throws Throwable {
        int i = r00720072r0072r0072;
        if (((r0072r00720072r0072 + i) * i) % rr007200720072r0072 != rrr00720072r0072) {
            try {
                r00720072r0072r0072 = ((Integer) Class.forName(xlxllxl.r007200720072r0072r("\u0012\u000b+\u00135NEv=*U<OiF\u000er!\u0017TzmJ\u000eNQV,6\nJ/[^4\u0019nD\u001b~y5|\u0003h|\u0018T\u0017", (char) (jjkjkjj.r00720072rrr0072() ^ 1742858819), (char) (jkkkjjj.rrr007200720072r() ^ 1252464324), (char) (jkkkjjj.rrr007200720072r() ^ 1252464215))).getMethod(xlxllxl.r0072r0072r0072r("Vl:\u001d\u00101Q\u00100\u001e \u00051%\u001d\u0006\\\u0007\fo<~", (char) (jjjjkjj.rrrrrr0072() ^ 2074272742), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105818)), null).invoke(null, null)).intValue();
                rrr00720072r0072 = 55;
            } catch (InvocationTargetException e) {
                throw e.getCause();
            }
        }
        return ((CipherInputStream) this).in.available();
    }
}
