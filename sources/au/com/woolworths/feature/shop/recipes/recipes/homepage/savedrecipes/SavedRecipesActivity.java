package au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes;

import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/homepage/savedrecipes/SavedRecipesActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SavedRecipesActivity extends Hilt_SavedRecipesActivity {
    public static final /* synthetic */ int y = 0;
    public FeatureToggleManager w;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(SavedRecipesViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    public final SavedRecipesViewModel N4() {
        return (SavedRecipesViewModel) this.x.getD();
    }

    @Override // au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.Hilt_SavedRecipesActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        N4().p6();
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final SavedRecipesActivity savedRecipesActivity = SavedRecipesActivity.this;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-226236371, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                int i = SavedRecipesActivity.y;
                                SavedRecipesActivity savedRecipesActivity2 = savedRecipesActivity;
                                SavedRecipesViewModel savedRecipesViewModelN4 = savedRecipesActivity2.N4();
                                composer2.o(5004770);
                                boolean zI = composer2.I(savedRecipesActivity2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    SavedRecipesActivity$onCreate$1$1$1$1 savedRecipesActivity$onCreate$1$1$1$1 = new SavedRecipesActivity$onCreate$1$1$1$1(0, savedRecipesActivity2, SavedRecipesActivity.class, "finish", "finish()V", 0);
                                    composer2.A(savedRecipesActivity$onCreate$1$1$1$1);
                                    objG = savedRecipesActivity$onCreate$1$1$1$1;
                                }
                                composer2.l();
                                Function0 function0 = (Function0) ((KFunction) objG);
                                SavedRecipesViewModel savedRecipesViewModelN42 = savedRecipesActivity2.N4();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(savedRecipesViewModelN42);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    SavedRecipesActivity$onCreate$1$1$2$1 savedRecipesActivity$onCreate$1$1$2$1 = new SavedRecipesActivity$onCreate$1$1$2$1(0, savedRecipesViewModelN42, SavedRecipesViewModel.class, "onPullToRefresh", "onPullToRefresh()V", 0);
                                    composer2.A(savedRecipesActivity$onCreate$1$1$2$1);
                                    objG2 = savedRecipesActivity$onCreate$1$1$2$1;
                                }
                                composer2.l();
                                SavedRecipesScreenKt.e(savedRecipesViewModelN4, function0, (Function0) ((KFunction) objG2), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -26213111));
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        N4().o.f(this, new SavedRecipesActivity$sam$androidx_lifecycle_Observer$0(new au.com.woolworths.feature.shop.instore.navigation.map.utils.a(this, 14)));
    }
}
