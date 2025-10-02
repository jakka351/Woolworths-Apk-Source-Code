package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.upstream.Allocator;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes2.dex */
public final class DefaultAllocator implements Allocator {
    public int d;
    public int e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3178a = true;
    public final int b = 65536;
    public int f = 0;
    public Allocation[] g = new Allocation[100];
    public final byte[] c = null;

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public final synchronized void a(Allocator.AllocationNode allocationNode) {
        while (allocationNode != null) {
            try {
                Allocation[] allocationArr = this.g;
                int i = this.f;
                this.f = i + 1;
                allocationArr[i] = allocationNode.a();
                this.e--;
                allocationNode = allocationNode.next();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public final synchronized void b() {
        try {
            int i = 0;
            int iMax = Math.max(0, Util.e(this.d, this.b) - this.e);
            int i2 = this.f;
            if (iMax >= i2) {
                return;
            }
            if (this.c != null) {
                int i3 = i2 - 1;
                while (i <= i3) {
                    Allocation allocation = this.g[i];
                    allocation.getClass();
                    if (allocation.f3175a == this.c) {
                        i++;
                    } else {
                        Allocation allocation2 = this.g[i3];
                        allocation2.getClass();
                        if (allocation2.f3175a != this.c) {
                            i3--;
                        } else {
                            Allocation[] allocationArr = this.g;
                            allocationArr[i] = allocation2;
                            allocationArr[i3] = allocation;
                            i3--;
                            i++;
                        }
                    }
                }
                iMax = Math.max(iMax, i);
                if (iMax >= this.f) {
                    return;
                }
            }
            Arrays.fill(this.g, iMax, this.f, (Object) null);
            this.f = iMax;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public final synchronized Allocation c() {
        Allocation allocation;
        try {
            int i = this.e + 1;
            this.e = i;
            int i2 = this.f;
            if (i2 > 0) {
                Allocation[] allocationArr = this.g;
                int i3 = i2 - 1;
                this.f = i3;
                allocation = allocationArr[i3];
                allocation.getClass();
                this.g[this.f] = null;
            } else {
                Allocation allocation2 = new Allocation(new byte[this.b], 0);
                Allocation[] allocationArr2 = this.g;
                if (i > allocationArr2.length) {
                    this.g = (Allocation[]) Arrays.copyOf(allocationArr2, allocationArr2.length * 2);
                }
                allocation = allocation2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return allocation;
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public final synchronized void d(Allocation allocation) {
        Allocation[] allocationArr = this.g;
        int i = this.f;
        this.f = i + 1;
        allocationArr[i] = allocation;
        this.e--;
        notifyAll();
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public final int e() {
        return this.b;
    }

    public final synchronized void f(int i) {
        boolean z = i < this.d;
        this.d = i;
        if (z) {
            b();
        }
    }
}
