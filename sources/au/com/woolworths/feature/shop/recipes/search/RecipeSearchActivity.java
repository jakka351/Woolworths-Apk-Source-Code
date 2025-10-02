package au.com.woolworths.feature.shop.recipes.search;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.supers.recipes.search.RecipeSearchAnalytics;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.myorders.details.infomodal.a;
import au.com.woolworths.feature.shop.recipes.search.RecipeSearchContract;
import au.com.woolworths.feature.shop.recipes.search.ui.RecipeSearchScreenKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/search/RecipeSearchActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "recipes-search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RecipeSearchActivity extends Hilt_RecipeSearchActivity {
    public static final /* synthetic */ int x = 0;
    public final ViewModelLazy w = new ViewModelLazy(Reflection.f24268a.b(RecipeSearchViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.recipes.search.RecipeSearchActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.recipes.search.RecipeSearchActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.recipes.search.RecipeSearchActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.search.RecipeSearchActivity$onCreate$2", f = "RecipeSearchActivity.kt", l = {43}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.recipes.search.RecipeSearchActivity$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.shop.recipes.search.RecipeSearchActivity$onCreate$2$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            public final /* synthetic */ RecipeSearchActivity d;

            public AnonymousClass1(RecipeSearchActivity recipeSearchActivity) {
                this.d = recipeSearchActivity;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function b() {
                return new AdaptedFunctionReference(2, this.d, RecipeSearchActivity.class, "handleActions", "handleActions(Lau/com/woolworths/feature/shop/recipes/search/RecipeSearchContract$Actions;)V", 4);
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                RecipeSearchContract.Actions actions = (RecipeSearchContract.Actions) obj;
                int i = RecipeSearchActivity.x;
                if (!(actions instanceof RecipeSearchContract.Actions.LaunchRecipeSearchResult)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = ((RecipeSearchContract.Actions.LaunchRecipeSearchResult) actions).f8083a;
                RecipeSearchActivity recipeSearchActivity = this.d;
                String string = recipeSearchActivity.getString(com.woolworths.R.string.recipe_search_result_page_title);
                Intrinsics.g(string, "getString(...)");
                Activities.RecipeList.RecipeListExtras recipeListExtras = new Activities.RecipeList.RecipeListExtras(new Activities.RecipeList.ExtrasPageData(string), new Activities.RecipeList.ExtrasBySearchTerm(str));
                Intent intentA = ActivityNavigatorKt.a(Activities.RecipeList.f4512a, ApplicationType.e);
                intentA.putExtra("RECIPE_LIST_EXTRAS", recipeListExtras);
                recipeSearchActivity.startActivity(intentA);
                recipeSearchActivity.finish();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                return Unit.f24250a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.c(b(), ((FunctionAdapter) obj).b());
                }
                return false;
            }

            public final int hashCode() {
                return b().hashCode();
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RecipeSearchActivity.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = RecipeSearchActivity.x;
                RecipeSearchActivity recipeSearchActivity = RecipeSearchActivity.this;
                Flow flow = ((RecipeSearchViewModel) recipeSearchActivity.w.getD()).i;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(recipeSearchActivity);
                this.p = 1;
                if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    @Override // au.com.woolworths.feature.shop.recipes.search.Hilt_RecipeSearchActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Activities.RecipeSearch.Extras extras = (Activities.RecipeSearch.Extras) getIntent().getParcelableExtra("RECIPE_SEARCH_EXTRAS");
        final String str = extras != null ? extras.d : null;
        if (str == null) {
            str = "";
        }
        final String str2 = extras != null ? extras.e : null;
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.search.RecipeSearchActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final String str3 = str2;
                    final RecipeSearchActivity recipeSearchActivity = this;
                    final String str4 = str;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1605061778, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.search.RecipeSearchActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                int i = RecipeSearchActivity.x;
                                RecipeSearchActivity recipeSearchActivity2 = recipeSearchActivity;
                                RecipeSearchViewModel recipeSearchViewModel = (RecipeSearchViewModel) recipeSearchActivity2.w.getD();
                                composer2.o(5004770);
                                boolean zI = composer2.I(recipeSearchActivity2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new a(recipeSearchActivity2, 11);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                RecipeSearchScreenKt.c(str4, str3, recipeSearchViewModel, (Function0) objG, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 985304538));
        LifecycleOwnerKt.a(this).c(new AnonymousClass2(null));
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        ((RecipeSearchViewModel) this.w.getD()).f.f(RecipeSearchAnalytics.RecipeSearch.d);
    }
}
