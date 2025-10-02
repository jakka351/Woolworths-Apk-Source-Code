package au.com.woolworths.sdui.common.corerow.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.sdui.common.IconAsset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/common/corerow/model/CoreRowModel;", "", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CoreRowModel {

    /* renamed from: a, reason: collision with root package name */
    public final String f9998a;
    public final IconAsset b;
    public final String c;
    public final String d;
    public final IconAsset e;
    public final String f;

    public CoreRowModel(String str, IconAsset iconAsset, String str2, String label, IconAsset iconAsset2, String str3) {
        Intrinsics.h(label, "label");
        this.f9998a = str;
        this.b = iconAsset;
        this.c = str2;
        this.d = label;
        this.e = iconAsset2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreRowModel)) {
            return false;
        }
        CoreRowModel coreRowModel = (CoreRowModel) obj;
        return Intrinsics.c(this.f9998a, coreRowModel.f9998a) && Intrinsics.c(this.b, coreRowModel.b) && Intrinsics.c(this.c, coreRowModel.c) && Intrinsics.c(this.d, coreRowModel.d) && Intrinsics.c(this.e, coreRowModel.e) && Intrinsics.c(this.f, coreRowModel.f);
    }

    public final int hashCode() {
        String str = this.f9998a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        IconAsset iconAsset = this.b;
        int iHashCode2 = (iHashCode + (iconAsset == null ? 0 : iconAsset.hashCode())) * 31;
        String str2 = this.c;
        int iC = b.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        IconAsset iconAsset2 = this.e;
        int iHashCode3 = (iC + (iconAsset2 == null ? 0 : iconAsset2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoreRowModel(overlineText=");
        sb.append(this.f9998a);
        sb.append(", leadingAsset=");
        sb.append(this.b);
        sb.append(", description=");
        a.B(sb, this.c, ", label=", this.d, ", trailingAsset=");
        sb.append(this.e);
        sb.append(", trailingText=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
