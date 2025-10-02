package com.lexisnexisrisk.threatmetrix.rl;

import android.util.Pair;
import com.lexisnexisrisk.threatmetrix.rl.tmxbhs.jjjjkjj;
import com.lexisnexisrisk.threatmetrix.rl.tmxbhs.jjkjkjj;
import com.lexisnexisrisk.threatmetrix.rl.tmxbhs.jkjjkjj;
import com.lexisnexisrisk.threatmetrix.rl.tmxbhs.jkkkjjj;
import com.lexisnexisrisk.threatmetrix.rl.tmxbhs.xlxllxl;
import com.lexisnexisrisk.threatmetrix.rl.tmxbhs.xxlxllx;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
public final class TMXBehavioSecInitializer implements TMXModuleInitializerInterface {
    public static int p00700070p00700070p = 12;
    public static int p0070p007000700070p = 1;
    public static int pp0070007000700070p = 2;
    public static int ppp007000700070p;

    public static int p00700070007000700070p() {
        return 78;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.TMXModuleMetadataProviderInterface
    public String getModuleVersion() {
        char cR00720072rrr0072 = (char) (jjkjkjj.r00720072rrr0072() ^ 1742858963);
        int i = p00700070p00700070p;
        if (((p0070p007000700070p + i) * i) % pp0070007000700070p != ppp007000700070p) {
            p00700070p00700070p = p00700070007000700070p();
            ppp007000700070p = 47;
        }
        return xlxllxl.r007200720072r0072r("vim`caG]?mc", cR00720072rrr0072, (char) (jkjjkjj.rr0072rrr0072() ^ 1132105823), (char) (jkjjkjj.rr0072rrr0072() ^ 1132105820));
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.TMXModuleInitializerInterface
    public String getNativeLibName() {
        while (true) {
            try {
                int[] iArr = new int[-1];
            } catch (Exception unused) {
                p00700070p00700070p = 10;
                int i = 3;
                while (true) {
                    try {
                        i /= 0;
                    } catch (Exception unused2) {
                        p00700070p00700070p = p00700070007000700070p();
                        while (true) {
                            try {
                                i /= 0;
                            } catch (Exception unused3) {
                                p00700070p00700070p = p00700070007000700070p();
                                return null;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.TMXModuleInitializerInterface
    public Pair<String, Object> initialize() throws Exception {
        try {
            Class.forName(xlxllxl.r007200720072r0072r("LWT\u0014QI[KTNDVFOMCLC\u0005J=F83E=4B?5Cw;4t:2<%*4m7*)4321", (char) (jkkkjjj.rrr007200720072r() ^ 1252464361), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858949), (char) (jkkkjjj.rrr007200720072r() ^ 1252464210))).getMethod(xlxllxl.r007200720072r0072r("T\u001e#y\u000f\u0002V]\u00035:Q(Z0p\f%\u0013", (char) (jkkkjjj.rrr007200720072r() ^ 1252464332), (char) (jjjjkjj.rrrrrr0072() ^ 2074272527), (char) (jkkkjjj.rrr007200720072r() ^ 1252464213)), null).invoke(null, null);
            xxlxllx xxlxllxVar = new xxlxllx();
            int i = p00700070p00700070p;
            if (((p0070p007000700070p + i) * i) % pp0070007000700070p != ppp007000700070p) {
                p00700070p00700070p = 88;
                ppp007000700070p = 69;
            }
            return new Pair<>(xlxllxl.r0072r0072r0072r("VYOaYSndjbXsW_fe^nme`q", (char) (jjjjkjj.rrrrrr0072() ^ 2074272576), (char) (jjkjkjj.r00720072rrr0072() ^ 1742858862)), xxlxllxVar.tt00740074007400740074());
        } catch (InvocationTargetException e) {
            throw e.getCause();
        } catch (Exception e2) {
            throw e2;
        }
    }
}
