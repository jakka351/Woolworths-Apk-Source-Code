package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        boolean z = true;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                Bundle source = (Bundle) obj2;
                String argName = (String) obj;
                Regex regex = NavDeepLink.q;
                Intrinsics.h(argName, "argName");
                Intrinsics.h(source, "source");
                return Boolean.valueOf(!source.containsKey(argName));
            default:
                String key = (String) obj;
                Intrinsics.h(key, "key");
                Object obj3 = ((Ref.ObjectRef) obj2).d;
                if (obj3 != null && ((Bundle) obj3).containsKey(key)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
