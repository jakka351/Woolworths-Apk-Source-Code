package androidx.compose.ui.graphics.vector;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", "", "Builder", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ImageVector {
    public static int k;
    public static final Companion l = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final String f1813a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final VectorGroup f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "", "GroupParams", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final String f1814a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final long f;
        public final int g;
        public final boolean h;
        public final ArrayList i;
        public final GroupParams j;
        public boolean k;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder$GroupParams;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class GroupParams {

            /* renamed from: a, reason: collision with root package name */
            public final String f1815a;
            public final float b;
            public final float c;
            public final float d;
            public final float e;
            public final float f;
            public final float g;
            public final float h;
            public final List i;
            public final ArrayList j;

            public GroupParams(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i) {
                str = (i & 1) != 0 ? "" : str;
                f = (i & 2) != 0 ? 0.0f : f;
                f2 = (i & 4) != 0 ? 0.0f : f2;
                f3 = (i & 8) != 0 ? 0.0f : f3;
                f4 = (i & 16) != 0 ? 1.0f : f4;
                f5 = (i & 32) != 0 ? 1.0f : f5;
                f6 = (i & 64) != 0 ? 0.0f : f6;
                f7 = (i & 128) != 0 ? 0.0f : f7;
                if ((i & 256) != 0) {
                    int i2 = VectorKt.f1820a;
                    list = EmptyList.d;
                }
                ArrayList arrayList = new ArrayList();
                this.f1815a = str;
                this.b = f;
                this.c = f2;
                this.d = f3;
                this.e = f4;
                this.f = f5;
                this.g = f6;
                this.h = f7;
                this.i = list;
                this.j = arrayList;
            }
        }

        public Builder(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
            str = (i2 & 1) != 0 ? "" : str;
            long j2 = (i2 & 32) != 0 ? Color.k : j;
            int i3 = (i2 & 64) != 0 ? 5 : i;
            boolean z2 = (i2 & 128) != 0 ? false : z;
            this.f1814a = str;
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
            this.f = j2;
            this.g = i3;
            this.h = z2;
            ArrayList arrayList = new ArrayList();
            this.i = arrayList;
            GroupParams groupParams = new GroupParams(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 1023);
            this.j = groupParams;
            arrayList.add(groupParams);
        }

        public final void a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list) {
            if (this.k) {
                InlineClassHelperKt.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            this.i.add(new GroupParams(str, f, f2, f3, f4, f5, f6, f7, list, 512));
        }

        public final void b(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, int i3, Brush brush, Brush brush2, String str, List list) {
            if (this.k) {
                InlineClassHelperKt.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            ((GroupParams) a.c(1, this.i)).j.add(new VectorPath(f, f2, f3, f4, f5, f6, f7, i, i2, i3, brush, brush2, str, list));
        }

        public final ImageVector d() {
            if (this.k) {
                InlineClassHelperKt.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            while (this.i.size() > 1) {
                e();
            }
            GroupParams groupParams = this.j;
            ImageVector imageVector = new ImageVector(this.f1814a, this.b, this.c, this.d, this.e, new VectorGroup(groupParams.f1815a, groupParams.b, groupParams.c, groupParams.d, groupParams.e, groupParams.f, groupParams.g, groupParams.h, groupParams.i, groupParams.j), this.f, this.g, this.h);
            this.k = true;
            return imageVector;
        }

        public final void e() {
            if (this.k) {
                InlineClassHelperKt.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            ArrayList arrayList = this.i;
            GroupParams groupParams = (GroupParams) arrayList.remove(arrayList.size() - 1);
            ((GroupParams) a.c(1, arrayList)).j.add(new VectorGroup(groupParams.f1815a, groupParams.b, groupParams.c, groupParams.d, groupParams.e, groupParams.f, groupParams.g, groupParams.h, groupParams.i, groupParams.j));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Companion;", "", "", "imageVectorCount", "I", "lock", "Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    public ImageVector(String str, float f, float f2, float f3, float f4, VectorGroup vectorGroup, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.f1813a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = vectorGroup;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageVector)) {
            return false;
        }
        ImageVector imageVector = (ImageVector) obj;
        return Intrinsics.c(this.f1813a, imageVector.f1813a) && Dp.a(this.b, imageVector.b) && Dp.a(this.c, imageVector.c) && this.d == imageVector.d && this.e == imageVector.e && this.f.equals(imageVector.f) && Color.c(this.g, imageVector.g) && this.h == imageVector.h && this.i == imageVector.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + android.support.v4.media.session.a.b(this.e, android.support.v4.media.session.a.b(this.d, android.support.v4.media.session.a.b(this.c, android.support.v4.media.session.a.b(this.b, this.f1813a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = Color.l;
        return Boolean.hashCode(this.i) + b.a(this.h, b.b(iHashCode, 31, this.g), 31);
    }
}
