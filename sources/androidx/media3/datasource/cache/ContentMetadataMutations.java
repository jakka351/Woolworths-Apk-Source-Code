package androidx.media3.datasource.cache;

import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.HashMap;

@UnstableApi
/* loaded from: classes2.dex */
public class ContentMetadataMutations {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2983a = new HashMap();
    public final ArrayList b = new ArrayList();

    public final void a(Object obj, String str) {
        obj.getClass();
        this.f2983a.put(str, obj);
        this.b.remove(str);
    }
}
