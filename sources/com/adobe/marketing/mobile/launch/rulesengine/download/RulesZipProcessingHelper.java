package com.adobe.marketing.mobile.launch.rulesengine.download;

import com.adobe.marketing.mobile.services.ServiceProvider;
import com.adobe.marketing.mobile.util.StringEncoder;
import java.io.File;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
class RulesZipProcessingHelper {
    public static File a(String str) throws NoSuchAlgorithmException {
        String strA = StringEncoder.a(str);
        StringBuilder sb = new StringBuilder();
        sb.append(ServiceProvider.a().f13238a.c().getPath());
        String str2 = File.separator;
        return new File(androidx.constraintlayout.core.state.a.l(sb, str2, "aepsdktmp", str2, strA));
    }

    public static File b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(a(str).getPath());
        return new File(YU.a.o(sb, File.separator, "rules.zip"));
    }
}
