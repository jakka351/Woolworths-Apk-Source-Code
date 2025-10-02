package com.lexisnexisrisk.threatmetrix.rl;

import android.util.Pair;
import com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vmmmvvm;
import com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vmvmmmv;
import com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vmvmvvm;
import com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vvmmvvm;
import com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vvvmmvm;
import com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vvvvmvm;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
public class TMXDeviceSecurityHealthInitializer implements TMXModuleInitializerInterface {
    public static int d00640064006400640064d = 2;
    public static int d0064d006400640064d = 38;
    public static int dd0064006400640064d = 1;

    public static int d0064dddd0064() {
        return 2;
    }

    public static int dd0064ddd0064() {
        return 54;
    }

    public static int dddddd0064() {
        return 1;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.TMXModuleMetadataProviderInterface
    public String getModuleVersion() {
        char cHhhh006800680068 = (char) (vvmmvvm.hhhh006800680068() ^ (-1058496211));
        char cHhh0068h00680068 = (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587843));
        int i = d0064d006400640064d;
        if (((dd0064006400640064d + i) * i) % d00640064006400640064d != 0) {
            d0064d006400640064d = 47;
            dd0064006400640064d = 67;
        }
        return vvvmmvm.n006E006En006Enn("$\u001c%\u001d%(\u0013.\u0015HC", cHhhh006800680068, cHhh0068h00680068);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.TMXModuleInitializerInterface
    public String getNativeLibName() {
        int i = d0064d006400640064d;
        if (((dddddd0064() + i) * i) % d0064dddd0064() != 0) {
            d0064d006400640064d = dd0064ddd0064();
            dd0064006400640064d = dd0064ddd0064();
        }
        return vvvmmvm.n006E006En006Enn("Iib6/\u000e%.oamM\u000b\u0006\u0019\u00068\u001dau@\u007f]&+A\u001f\u0003\u0010E`\u000b-I`\u00168", (char) (vmmmvvm.hh0068h006800680068() ^ 263258468), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587849)));
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.TMXModuleInitializerInterface
    public Pair<String, Object> initialize() throws Throwable {
        try {
            Class.forName(vvvmmvm.n006E006En006Enn("Ta`\"a[oalh`tfqqitm1xmxli}wp\u0001\u007fw\b>\u0004~A\t\u0003\u000f{\f\u0002H\u0012\n\u000b\u0015\u0016\u0017\u0018", (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843107)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496256)))).getMethod(vvvmmvm.n006E006En006Enn("\f\rMNVP\u0012\u0013ST\\VWX`Z", (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843163)), (char) (vmmmvvm.hh0068h006800680068() ^ 263258530)), null).invoke(null, null);
            Pair<String, Object> pair = new Pair<>(vvvmmvm.n006E006En006Enn("\u0002\u0003v\u0007|t\u000e\u0002\u0006{o\tll|ngh\u0002tebsoeos", (char) (vvmmvvm.hhhh006800680068() ^ (-1058496061)), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843028))), new vmvmmmv().hhh00680068h0068());
            int i = d0064d006400640064d;
            if (((dd0064006400640064d + i) * i) % d00640064006400640064d != 0) {
                d0064d006400640064d = 40;
                dd0064006400640064d = 86;
            }
            return pair;
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }
}
