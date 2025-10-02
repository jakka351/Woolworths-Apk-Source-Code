package com.adobe.marketing.mobile.services.internal.caching;

import androidx.constraintlayout.core.state.a;
import com.adobe.marketing.mobile.services.ServiceProvider;
import com.adobe.marketing.mobile.util.StringEncoder;
import com.adobe.marketing.mobile.util.StringUtils;
import java.io.File;

/* loaded from: classes.dex */
class CacheFileManager {
    public static boolean a(String str, String str2) {
        return (StringUtils.a(str) || StringUtils.a(str2)) ? false : true;
    }

    public final String b(String str, String str2) {
        if (!a(str, str2)) {
            return null;
        }
        String strA = StringEncoder.a(str2);
        StringBuilder sb = new StringBuilder();
        sb.append(ServiceProvider.a().f13238a.c().getPath());
        String str3 = File.separator;
        a.B(sb, str3, "aepsdkcache", str3, str);
        return YU.a.o(sb, str3, strA);
    }

    public final String c(String str, String str2) {
        if (a(str, str2)) {
            return YU.a.o(new StringBuilder(), b(str, str2), "_metadata.txt");
        }
        return null;
    }
}
