package au.com.woolworths.sdui.common.coretag.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.common.corecolortheme.CoreColorTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/common/coretag/model/CoreTagModel;", "", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CoreTagModel {

    /* renamed from: a, reason: collision with root package name */
    public final String f9999a;
    public final CoreColorTheme b;
    public final boolean c;
    public final IconAsset d;

    public CoreTagModel(String label, CoreColorTheme coreColorTheme, boolean z, IconAsset iconAsset) {
        Intrinsics.h(label, "label");
        this.f9999a = label;
        this.b = coreColorTheme;
        this.c = z;
        this.d = iconAsset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreTagModel)) {
            return false;
        }
        CoreTagModel coreTagModel = (CoreTagModel) obj;
        return Intrinsics.c(this.f9999a, coreTagModel.f9999a) && Intrinsics.c(this.b, coreTagModel.b) && this.c == coreTagModel.c && Intrinsics.c(this.d, coreTagModel.d);
    }

    public final int hashCode() {
        int iE = b.e((this.b.hashCode() + (this.f9999a.hashCode() * 31)) * 31, 31, this.c);
        IconAsset iconAsset = this.d;
        return iE + (iconAsset == null ? 0 : iconAsset.hashCode());
    }

    public final String toString() {
        return "CoreTagModel(label=" + this.f9999a + ", coreColorTheme=" + this.b + ", hasBorder=" + this.c + ", icon=" + this.d + ")";
    }
}
