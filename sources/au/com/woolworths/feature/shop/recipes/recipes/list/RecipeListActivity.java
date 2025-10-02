package au.com.woolworths.feature.shop.recipes.recipes.list;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.recipes.databinding.ActivityRecipeListBinding;
import au.com.woolworths.feature.shop.recipes.recipes.RecipesInteractor;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.card.MaterialCardView;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/recipes/list/RecipeListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RecipeListActivity extends Hilt_RecipeListActivity {
    public static final /* synthetic */ int C = 0;
    public String A;
    public FeatureToggleManager B;
    public ActivityRecipeListBinding x;
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(RecipeListViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final Lazy z = LazyKt.b(new au.com.woolworths.feature.shop.myorders.details.infomodal.a(this, 10));

    public RecipeListActivity() {
        registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new androidx.activity.compose.a(this, 11));
    }

    public final RecipeListViewModel O4() {
        return (RecipeListViewModel) this.y.getD();
    }

    public final void P4() {
        Parcelable parcelableExtra = getIntent().getParcelableExtra("RECIPE_LIST_EXTRAS");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("Extras not provided");
        }
        Activities.RecipeList.RecipeListExtras recipeListExtras = (Activities.RecipeList.RecipeListExtras) parcelableExtra;
        Activities.RecipeList.ExtraRecipeListSource extraRecipeListSource = recipeListExtras.e;
        RecipeListViewModel recipeListViewModelO4 = O4();
        RecipesInteractor recipesInteractor = recipeListViewModelO4.f;
        MutableLiveData mutableLiveData = recipeListViewModelO4.o;
        recipeListViewModelO4.n = extraRecipeListSource;
        if (extraRecipeListSource == null) {
            Intrinsics.p("recipeListSource");
            throw null;
        }
        if (extraRecipeListSource instanceof Activities.RecipeList.ExtrasBySourceAndTags) {
            Activities.RecipeList.ExtrasBySourceAndTags extrasBySourceAndTags = (Activities.RecipeList.ExtrasBySourceAndTags) extraRecipeListSource;
            List list = extrasBySourceAndTags.d;
            if (list == null) {
                list = EmptyList.d;
            }
            mutableLiveData.m(recipesInteractor.b(extrasBySourceAndTags.e, list));
        } else {
            if (!(extraRecipeListSource instanceof Activities.RecipeList.ExtrasBySearchTerm)) {
                throw new IllegalArgumentException("Recipe List: The source provided is not implemented");
            }
            mutableLiveData.m(recipesInteractor.a(((Activities.RecipeList.ExtrasBySearchTerm) extraRecipeListSource).d));
        }
        String str = recipeListExtras.d.d;
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.A(str);
        Activities.RecipeList.ExtrasBySearchTerm extrasBySearchTerm = extraRecipeListSource instanceof Activities.RecipeList.ExtrasBySearchTerm ? (Activities.RecipeList.ExtrasBySearchTerm) extraRecipeListSource : null;
        if (extrasBySearchTerm != null) {
            ActivityRecipeListBinding activityRecipeListBinding = this.x;
            if (activityRecipeListBinding == null) {
                Intrinsics.p("activityBinding");
                throw null;
            }
            MaterialCardView searchCard = activityRecipeListBinding.A;
            Intrinsics.g(searchCard, "searchCard");
            BindingAdaptersKt.o(searchCard, true);
            activityRecipeListBinding.B.s(extrasBySearchTerm.d, false);
        }
        this.A = str;
    }

    @Override // au.com.woolworths.feature.shop.recipes.recipes.list.Hilt_RecipeListActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityRecipeListBinding activityRecipeListBinding = (ActivityRecipeListBinding) DataBindingUtil.d(this, R.layout.activity_recipe_list);
        this.x = activityRecipeListBinding;
        if (activityRecipeListBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        EpoxyRecyclerView content = activityRecipeListBinding.y;
        activityRecipeListBinding.D(this);
        Intrinsics.g(content, "content");
        ViewExtKt.a(content);
        content.setController((RecipeListEpoxyController) this.z.getD());
        activityRecipeListBinding.L(O4());
        ActivityRecipeListBinding activityRecipeListBinding2 = this.x;
        if (activityRecipeListBinding2 == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        setSupportActionBar(activityRecipeListBinding2.C);
        P4();
        O4().p.f(this, new RecipeListActivity$sam$androidx_lifecycle_Observer$0(new a(this, 1)));
        O4().r.f(this, new RecipeListActivity$sam$androidx_lifecycle_Observer$0(new a(this, 2)));
        O4().q.f(this, new RecipeListActivity$sam$androidx_lifecycle_Observer$0(new a(this, 3)));
        O4().t.f(this, new RecipeListActivity$sam$androidx_lifecycle_Observer$0(new a(this, 4)));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new RecipeListActivity$setupActionsListener$1(this, null), 3);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                onBackPressed();
                zOnOptionsItemSelected = true;
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            }
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        O4().s.f(this, new RecipeListActivity$sam$androidx_lifecycle_Observer$0(new a(this, 0)));
    }
}
