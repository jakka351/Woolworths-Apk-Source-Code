package au.com.woolworths.dynamic.page.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/dynamic/page/data/CategoryTileData;", "", "dynamic-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CategoryTileData {

    /* renamed from: a, reason: collision with root package name */
    public final String f5179a;
    public final String b;
    public final String c;
    public final String d;

    public CategoryTileData(String title, String str, String str2, String str3) {
        Intrinsics.h(title, "title");
        this.f5179a = title;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryTileData)) {
            return false;
        }
        CategoryTileData categoryTileData = (CategoryTileData) obj;
        return Intrinsics.c(this.f5179a, categoryTileData.f5179a) && Intrinsics.c(this.b, categoryTileData.b) && Intrinsics.c(this.c, categoryTileData.c) && Intrinsics.c(this.d, categoryTileData.d);
    }

    public final int hashCode() {
        int iC = b.c(this.f5179a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return a.l(YU.a.v("CategoryTileData(title=", this.f5179a, ", imageUrl=", this.b, ", imageAltText="), this.c, ", action=", this.d, ")");
    }
}
