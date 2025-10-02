package androidx.compose.foundation.lazy.layout;

import com.google.android.gms.common.ConnectionResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LazyLayoutScrollScopeKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1055a = 2500;
    public static final float b = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    public static final float c = 50;

    public static final boolean a(boolean z, LazyLayoutScrollScope lazyLayoutScrollScope, int i) {
        if (z) {
            if (lazyLayoutScrollScope.c() > i) {
                return true;
            }
            return lazyLayoutScrollScope.c() == i && lazyLayoutScrollScope.g() > 0;
        }
        if (lazyLayoutScrollScope.c() < i) {
            return true;
        }
        return lazyLayoutScrollScope.c() == i && lazyLayoutScrollScope.g() < 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0 A[Catch: ItemFoundInScroll -> 0x018d, TryCatch #4 {ItemFoundInScroll -> 0x018d, blocks: (B:33:0x00bc, B:35:0x00c0, B:37:0x00c6, B:50:0x00ec, B:52:0x0100, B:56:0x0115), top: B:103:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0167 -> B:109:0x0171). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope r27, int r28, int r29, androidx.compose.ui.unit.Density r30, kotlin.coroutines.jvm.internal.ContinuationImpl r31) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt.b(androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope, int, int, androidx.compose.ui.unit.Density, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final boolean c(LazyLayoutScrollScope lazyLayoutScrollScope, int i) {
        return i <= lazyLayoutScrollScope.d() && lazyLayoutScrollScope.c() <= i;
    }
}
