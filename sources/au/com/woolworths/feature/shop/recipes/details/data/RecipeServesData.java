package au.com.woolworths.feature.shop.recipes.details.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/data/RecipeServesData;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RecipeServesData {

    /* renamed from: a, reason: collision with root package name */
    public final int f8022a;
    public final String b;
    public final int c;
    public final int d;

    public RecipeServesData(int i, int i2, int i3, String str) {
        this.f8022a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipeServesData)) {
            return false;
        }
        RecipeServesData recipeServesData = (RecipeServesData) obj;
        return this.f8022a == recipeServesData.f8022a && Intrinsics.c(this.b, recipeServesData.b) && this.c == recipeServesData.c && this.d == recipeServesData.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + b.a(this.c, b.c(Integer.hashCode(this.f8022a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        return a.i(this.c, this.d, ", maximum=", ")", androidx.constraintlayout.core.state.a.p("RecipeServesData(quantity=", this.f8022a, ", title=", this.b, ", minimum="));
    }
}
