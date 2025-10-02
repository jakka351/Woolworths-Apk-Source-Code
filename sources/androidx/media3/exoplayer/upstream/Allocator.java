package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public interface Allocator {

    public interface AllocationNode {
        Allocation a();

        AllocationNode next();
    }

    void a(AllocationNode allocationNode);

    void b();

    Allocation c();

    void d(Allocation allocation);

    int e();
}
