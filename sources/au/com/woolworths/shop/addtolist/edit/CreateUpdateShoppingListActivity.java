package au.com.woolworths.shop.addtolist.edit;

import android.R;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.LinearLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.supers.lists.ListsAnalytics;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.wallet.digipay.framesview.a;
import au.com.woolworths.product.details.d;
import au.com.woolworths.shop.addtolist.databinding.ActivityCreateUpdateShoppingListBinding;
import au.com.woolworths.shop.addtolist.databinding.ItemColorSwatchBinding;
import au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListContract;
import com.google.android.material.snackbar.Snackbar;
import com.salesforce.marketingcloud.UrlHandler;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/addtolist/edit/CreateUpdateShoppingListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CreateUpdateShoppingListActivity extends Hilt_CreateUpdateShoppingListActivity {
    public static final /* synthetic */ int A = 0;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(CreateUpdateShoppingListViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public ActivityCreateUpdateShoppingListBinding y;
    public ArrayList z;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/edit/CreateUpdateShoppingListActivity$Companion;", "", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static Intent a(Activities.CreateUpdateShoppingList.Mode mode, String str) {
            Intent intentA = ActivityNavigatorKt.a(Activities.CreateUpdateShoppingList.f4464a, ApplicationType.e);
            intentA.putExtra("EXTRA_LIST_INFO", new Activities.CreateUpdateShoppingList.Extras(mode, str, null, 4));
            return intentA;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Activities.CreateUpdateShoppingList.Mode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Activities.CreateUpdateShoppingList.Mode mode = Activities.CreateUpdateShoppingList.Mode.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Activities.CreateUpdateShoppingList.Mode mode2 = Activities.CreateUpdateShoppingList.Mode.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity$onCreate$2", f = "CreateUpdateShoppingListActivity.kt", l = {73}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", UrlHandler.ACTION, "Lau/com/woolworths/shop/addtolist/edit/CreateUpdateShoppingListContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity$onCreate$2$2", f = "CreateUpdateShoppingListActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity$onCreate$2$2, reason: invalid class name and collision with other inner class name */
        final class C02332 extends SuspendLambda implements Function2<CreateUpdateShoppingListContract.Actions, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ CreateUpdateShoppingListActivity q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02332(CreateUpdateShoppingListActivity createUpdateShoppingListActivity, Continuation continuation) {
                super(2, continuation);
                this.q = createUpdateShoppingListActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C02332 c02332 = new C02332(this.q, continuation);
                c02332.p = obj;
                return c02332;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C02332 c02332 = (C02332) create((CreateUpdateShoppingListContract.Actions) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                c02332.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                CreateUpdateShoppingListContract.Actions actions = (CreateUpdateShoppingListContract.Actions) this.p;
                int i = CreateUpdateShoppingListActivity.A;
                boolean z = actions instanceof CreateUpdateShoppingListContract.Actions.ShowSnackbar;
                CreateUpdateShoppingListActivity createUpdateShoppingListActivity = this.q;
                if (z) {
                    CharSequence text = ((CreateUpdateShoppingListContract.Actions.ShowSnackbar) actions).f10123a.getText(createUpdateShoppingListActivity);
                    ActivityCreateUpdateShoppingListBinding activityCreateUpdateShoppingListBinding = createUpdateShoppingListActivity.y;
                    if (activityCreateUpdateShoppingListBinding == null) {
                        Intrinsics.p("activityBinding");
                        throw null;
                    }
                    Snackbar.j(null, activityCreateUpdateShoppingListBinding.h, text, -1).l();
                } else if (actions instanceof CreateUpdateShoppingListContract.Actions.FinishActivity) {
                    CreateUpdateShoppingListContract.Actions.FinishActivity finishActivity = (CreateUpdateShoppingListContract.Actions.FinishActivity) actions;
                    Intent intent = new Intent();
                    intent.putExtra("EXTRA_RESULT", new Activities.CreateUpdateShoppingList.CreateUpdateResult(finishActivity.f10121a, finishActivity.b, finishActivity.c));
                    createUpdateShoppingListActivity.setResult(-1, intent);
                    createUpdateShoppingListActivity.finish();
                } else {
                    if (!(actions instanceof CreateUpdateShoppingListContract.Actions.ShowMaxListCountReachedErrorDialog)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CreateUpdateShoppingListContract.Actions.ShowMaxListCountReachedErrorDialog showMaxListCountReachedErrorDialog = (CreateUpdateShoppingListContract.Actions.ShowMaxListCountReachedErrorDialog) actions;
                    new AlertDialog.Builder(createUpdateShoppingListActivity).setTitle(showMaxListCountReachedErrorDialog.f10122a.getText(createUpdateShoppingListActivity)).setMessage(showMaxListCountReachedErrorDialog.b.getText(createUpdateShoppingListActivity)).setCancelable(false).setPositiveButton(R.string.ok, new a(createUpdateShoppingListActivity, 8)).show();
                    createUpdateShoppingListActivity.O4().h.g(ListsAnalytics.Lists.Action.e);
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CreateUpdateShoppingListActivity.this.new AnonymousClass2(continuation);
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
                int i2 = CreateUpdateShoppingListActivity.A;
                final CreateUpdateShoppingListActivity createUpdateShoppingListActivity = CreateUpdateShoppingListActivity.this;
                final Flow flow = createUpdateShoppingListActivity.O4().l;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C02332(createUpdateShoppingListActivity, null), new Flow<CreateUpdateShoppingListContract.Actions>() { // from class: au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity$onCreate$2$invokeSuspend$$inlined$filter$1

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity$onCreate$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public final class AnonymousClass2<T> implements FlowCollector {
                        public final /* synthetic */ FlowCollector d;
                        public final /* synthetic */ CreateUpdateShoppingListActivity e;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity$onCreate$2$invokeSuspend$$inlined$filter$1$2", f = "CreateUpdateShoppingListActivity.kt", l = {50}, m = "emit")
                        /* renamed from: au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity$onCreate$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public final class AnonymousClass1 extends ContinuationImpl {
                            public /* synthetic */ Object p;
                            public int q;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.p = obj;
                                this.q |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, CreateUpdateShoppingListActivity createUpdateShoppingListActivity) {
                            this.d = flowCollector;
                            this.e = createUpdateShoppingListActivity;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity$onCreate$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity$onCreate$2$invokeSuspend$$inlined$filter$1$2$1 r0 = (au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity$onCreate$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.q
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.q = r1
                                goto L18
                            L13:
                                au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity$onCreate$2$invokeSuspend$$inlined$filter$1$2$1 r0 = new au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity$onCreate$2$invokeSuspend$$inlined$filter$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.p
                                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                                int r2 = r0.q
                                r3 = 1
                                if (r2 == 0) goto L2f
                                if (r2 != r3) goto L27
                                kotlin.ResultKt.b(r6)
                                goto L52
                            L27:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L2f:
                                kotlin.ResultKt.b(r6)
                                r6 = r5
                                au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListContract$Actions r6 = (au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListContract.Actions) r6
                                au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity r6 = r4.e
                                androidx.lifecycle.Lifecycle r6 = r6.getD()
                                androidx.lifecycle.Lifecycle$State r6 = r6.getD()
                                androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.h
                                int r6 = r6.compareTo(r2)
                                if (r6 < 0) goto L52
                                r0.q = r3
                                kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L52
                                return r1
                            L52:
                                kotlin.Unit r5 = kotlin.Unit.f24250a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity$onCreate$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector, createUpdateShoppingListActivity), continuation);
                        return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                    }
                });
                this.p = 1;
                if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
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

    public final CreateUpdateShoppingListViewModel O4() {
        return (CreateUpdateShoppingListViewModel) this.x.getD();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        CreateUpdateShoppingListViewModel createUpdateShoppingListViewModelO4 = O4();
        createUpdateShoppingListViewModelO4.h.c(createUpdateShoppingListViewModelO4.m.a(createUpdateShoppingListViewModelO4.p6()).a());
    }

    @Override // au.com.woolworths.shop.addtolist.edit.Hilt_CreateUpdateShoppingListActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        CreateUpdateShoppingListContract.ActivityMode activityMode;
        super.onCreate(bundle);
        Intent intent = getIntent();
        Intrinsics.g(intent, "getIntent(...)");
        Parcelable parcelableExtra = intent.getParcelableExtra("EXTRA_LIST_INFO");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("list info is required in Bundle");
        }
        Activities.CreateUpdateShoppingList.Extras extras = (Activities.CreateUpdateShoppingList.Extras) parcelableExtra;
        CreateUpdateShoppingListViewModel createUpdateShoppingListViewModelO4 = O4();
        int iOrdinal = extras.d.ordinal();
        if (iOrdinal == 0) {
            activityMode = CreateUpdateShoppingListContract.ActivityMode.d;
        } else if (iOrdinal == 1) {
            activityMode = CreateUpdateShoppingListContract.ActivityMode.e;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            activityMode = CreateUpdateShoppingListContract.ActivityMode.f;
        }
        CreateUpdateShoppingListContract.ActivityMode activityMode2 = activityMode;
        String str = extras.e;
        Map initialProductItems = extras.f;
        Intrinsics.h(initialProductItems, "initialProductItems");
        BuildersKt.c(ViewModelKt.a(createUpdateShoppingListViewModelO4), null, null, new CreateUpdateShoppingListViewModel$init$1(activityMode2, createUpdateShoppingListViewModelO4, null), 3);
        if (str != null) {
            CreateUpdateShoppingListViewModel.t6(createUpdateShoppingListViewModelO4, createUpdateShoppingListViewModelO4.j, activityMode2, null, true, 2);
            BuildersKt.c(ViewModelKt.a(createUpdateShoppingListViewModelO4), null, null, new CreateUpdateShoppingListViewModel$fetchList$1(createUpdateShoppingListViewModelO4, str, activityMode2, null), 3);
        }
        createUpdateShoppingListViewModelO4.n = initialProductItems;
        ActivityCreateUpdateShoppingListBinding activityCreateUpdateShoppingListBinding = (ActivityCreateUpdateShoppingListBinding) DataBindingUtil.d(this, com.woolworths.R.layout.activity_create_update_shopping_list);
        activityCreateUpdateShoppingListBinding.D(this);
        activityCreateUpdateShoppingListBinding.L(O4());
        LinearLayout colorPicker = activityCreateUpdateShoppingListBinding.y;
        Intrinsics.g(colorPicker, "colorPicker");
        String[] stringArray = getResources().getStringArray(com.woolworths.R.array.shop_list_icon_color_names);
        Intrinsics.g(stringArray, "getStringArray(...)");
        int[] intArray = getResources().getIntArray(com.woolworths.R.array.shop_list_icon_colors);
        Intrinsics.g(intArray, "getIntArray(...)");
        ArrayList arrayList = new ArrayList(intArray.length);
        int length = intArray.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = intArray[i];
            ItemColorSwatchBinding itemColorSwatchBinding = (ItemColorSwatchBinding) DataBindingUtil.c(getLayoutInflater(), com.woolworths.R.layout.item_color_swatch, colorPicker, true, null);
            itemColorSwatchBinding.L(i3);
            itemColorSwatchBinding.M(stringArray[i2]);
            itemColorSwatchBinding.O(new CreateUpdateShoppingListActivity$setupColorSwatches$1$1$1(1, O4(), CreateUpdateShoppingListViewModel.class, "updateListColor", "updateListColor(I)V", 0));
            arrayList.add(itemColorSwatchBinding);
            i++;
            i2++;
        }
        this.z = arrayList;
        activityCreateUpdateShoppingListBinding.F.setNavigationOnClickListener(new au.com.woolworths.base.shopapp.customviews.a(this, 10));
        ConstraintLayout titleLayout = activityCreateUpdateShoppingListBinding.E;
        Intrinsics.g(titleLayout, "titleLayout");
        ViewExtKt.b(titleLayout, new au.com.woolworths.foundation.shop.olive.voice.ui.permission.a(10));
        this.y = activityCreateUpdateShoppingListBinding;
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass2(null), 3);
        O4().k.f(this, new CreateUpdateShoppingListActivityKt$sam$androidx_lifecycle_Observer$0(new d(this, 5)));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        CreateUpdateShoppingListViewModel createUpdateShoppingListViewModelO4 = O4();
        BuildersKt.c(ViewModelKt.a(createUpdateShoppingListViewModelO4), null, null, new CreateUpdateShoppingListViewModel$trackScreen$1(createUpdateShoppingListViewModelO4, null), 3);
    }
}
