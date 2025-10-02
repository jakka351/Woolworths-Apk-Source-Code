package au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes;

import android.content.res.Resources;
import androidx.lifecycle.Observer;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavedRecipesActivity$sam$androidx_lifecycle_Observer$0 implements Observer, FunctionAdapter {
    public final /* synthetic */ au.com.woolworths.feature.shop.instore.navigation.map.utils.a d;

    public SavedRecipesActivity$sam$androidx_lifecycle_Observer$0(au.com.woolworths.feature.shop.instore.navigation.map.utils.a aVar) {
        this.d = aVar;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.c(b(), ((FunctionAdapter) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) throws Resources.NotFoundException {
        this.d.invoke(obj);
    }
}
