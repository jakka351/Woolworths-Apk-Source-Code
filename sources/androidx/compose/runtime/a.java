package androidx.compose.runtime;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Intrinsics.j(((Invalidation) obj).b, ((Invalidation) obj2).b);
    }
}
