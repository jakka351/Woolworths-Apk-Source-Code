package com.lexisnexisrisk.threatmetrix.rl;

import android.util.Pair;
import com.lexisnexisrisk.threatmetrix.rl.tmxauth.qbbqqbb;
import com.lexisnexisrisk.threatmetrix.rl.tmxauth.qbqbqqb;
import com.lexisnexisrisk.threatmetrix.rl.tmxauth.qbqqqbb;
import com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqbqqbb;
import com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
public class TMXAuthenticationInitializer implements TMXModuleInitializerInterface {
    public static int s0073007300730073s0073 = 2;
    public static int s00730073s0073s0073 = 0;
    public static int ss0073s0073s0073 = 13;
    public static int sss00730073s0073 = 1;

    public static int s0073s00730073s0073() {
        return 2;
    }

    public static int ss007300730073s0073() {
        return 21;
    }

    public static int sssss00730073() {
        return 1;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.TMXModuleMetadataProviderInterface
    public String getModuleVersion() {
        int iQqq007100710071q = qbbqqbb.qqq007100710071q();
        int i = ss0073s0073s0073;
        if (((sss00730073s0073 + i) * i) % s0073007300730073s0073 != s00730073s0073s0073) {
            ss0073s0073s0073 = ss007300730073s0073();
            s00730073s0073s0073 = 42;
        }
        return qqqqbbb.q0071q00710071q0071("\"\u0018\u001f\u0015\u001b\u001c\u0005\u001e\u00034-", (char) (iQqq007100710071q ^ (-321957262)), (char) (qbbqqbb.qqq007100710071q() ^ (-321957273)));
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.TMXModuleInitializerInterface
    public String getNativeLibName() {
        char cQq00710071q0071q = (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710787));
        int iSs007300730073s0073 = ss007300730073s0073();
        if (((sssss00730073() + iSs007300730073s0073) * iSs007300730073s0073) % s0073007300730073s0073 != 0) {
            ss0073s0073s0073 = 5;
            s00730073s0073s0073 = ss007300730073s0073();
        }
        return qqqqbbb.q0071007100710071q0071("(\".\u0018MMB@JQGBAUKRR\u0012XS\u0015 \u0018!\u0019!$\u001cZ_[", cQq00710071q0071q, (char) (qqbqqbb.q0071qq00710071q() ^ 2118014503), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710752)));
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.TMXModuleInitializerInterface
    public Pair<String, Object> initialize() throws Throwable {
        try {
            Class.forName(qqqqbbb.q0071q00710071q0071("\u0011q;jv:ofI\u000byt6<%|M5N*W\u000b*\u001c\\w\u000fAou'}\\u\u001f\u00153`LPQZm!\nwM\u00022O", (char) (qbbqqbb.qqq007100710071q() ^ (-321957302)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014683))).getMethod(qqqqbbb.q0071q00710071q0071("\r\f\u000b\nMLQ\\IHMXEDIT", (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710775)), (char) (qqbqqbb.q0071qq00710071q() ^ 2118014677)), null).invoke(null, null);
            qbqbqqb qbqbqqbVar = new qbqbqqb();
            int i = ss0073s0073s0073;
            if (((sss00730073s0073 + i) * i) % s0073s00730073s0073() != s00730073s0073s0073) {
                ss0073s0073s0073 = ss007300730073s0073();
                s00730073s0073s0073 = ss007300730073s0073();
            }
            return new Pair<>(qqqqbbb.q0071q00710071q0071("lmaqg_xlpfZsTgeXT\\aUNK]QVT", (char) (qbbqqbb.qqq007100710071q() ^ (-321957256)), (char) (qbqqqbb.qq00710071q0071q() ^ (-1208710750))), qbqbqqbVar.qq007100710071qq());
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }
}
