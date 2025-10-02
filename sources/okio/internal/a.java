package okio.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.Path;
import okio.internal.ResourceFileSystem;

/* loaded from: classes8.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ZipEntry entry = (ZipEntry) obj;
        switch (this.d) {
            case 0:
                Path path = ResourceFileSystem.j;
                Intrinsics.h(entry, "entry");
                return Boolean.valueOf(ResourceFileSystem.Companion.a(entry.f26789a));
            default:
                Intrinsics.h(entry, "it");
                return Boolean.TRUE;
        }
    }
}
