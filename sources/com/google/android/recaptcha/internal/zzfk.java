package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.medallia.digital.mobilesdk.q2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzfk {

    @NotNull
    private final List zza;

    public zzfk() {
        this(true);
    }

    public static final boolean zzc(@NotNull Uri uri) {
        return zze(uri);
    }

    private final boolean zzd(String str) {
        List list = this.zza;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.W(str, (String) it.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean zze(Uri uri) {
        return (TextUtils.isEmpty(uri.toString()) || !"https".equals(uri.getScheme()) || TextUtils.isEmpty(uri.getHost())) ? false : true;
    }

    private static final List zzf(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add("https://" + ((String) it.next()) + q2.c);
        }
        return arrayList;
    }

    public final boolean zza(@NotNull Uri uri) {
        return zze(uri) && zzd(uri.toString());
    }

    public final boolean zzb(@NotNull String str) {
        Uri uri = Uri.parse(str);
        Intrinsics.e(uri);
        return zze(uri) && zzd(uri.toString());
    }

    public zzfk(boolean z) {
        this.zza = zzf(CollectionsKt.R("www.recaptcha.net", "www.gstatic.com/recaptcha", "www.gstatic.cn/recaptcha"));
    }
}
