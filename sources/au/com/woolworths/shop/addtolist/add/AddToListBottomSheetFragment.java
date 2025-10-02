package au.com.woolworths.shop.addtolist.add;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.extensions.DialogFragmentExtKt;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.product.extensions.MiscExtKt;
import au.com.woolworths.product.infoview.InfoViewFactory;
import au.com.woolworths.product.infoview.ProductInfoView;
import au.com.woolworths.product.infoview.ProductInfoViewFactory;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetActions;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetContract;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.databinding.FragmentAddToListBottomSheetBinding;
import au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity;
import au.com.woolworths.shop.addtolist.models.AddToListProductParameters;
import au.com.woolworths.shop.addtolist.models.CopyFromListParameters;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.snackbar.Snackbar;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "BottomSheetHost", "Extras", "AddToListBottomSheetHostScreen", "Companion", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AddToListBottomSheetFragment extends Hilt_AddToListBottomSheetFragment {
    public final Lazy i = LazyKt.b(new Function0() { // from class: au.com.woolworths.shop.addtolist.add.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            AddToListBottomSheetFragment addToListBottomSheetFragment = this.d;
            Object parentFragment = addToListBottomSheetFragment.getParentFragment();
            if (parentFragment == null) {
                parentFragment = addToListBottomSheetFragment.getActivity();
            }
            Intrinsics.f(parentFragment, "null cannot be cast to non-null type au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost");
            return (AddToListBottomSheetFragment.BottomSheetHost) parentFragment;
        }
    });
    public FragmentAddToListBottomSheetBinding j;
    public AddToListBottomSheetEpoxyController k;
    public final ViewModelLazy l;
    public InfoViewFactory m;
    public final ActivityResultLauncher n;

    @Parcelize
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetFragment$AddToListBottomSheetHostScreen;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "Landroid/os/Parcelable;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddToListBottomSheetHostScreen implements Screen, Parcelable {

        @NotNull
        public static final Parcelable.Creator<AddToListBottomSheetHostScreen> CREATOR = new Creator();
        public final String d;
        public final String e;
        public final String f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AddToListBottomSheetHostScreen> {
            @Override // android.os.Parcelable.Creator
            public final AddToListBottomSheetHostScreen createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new AddToListBottomSheetHostScreen(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AddToListBottomSheetHostScreen[] newArray(int i) {
                return new AddToListBottomSheetHostScreen[i];
            }
        }

        public AddToListBottomSheetHostScreen(String screenName, String sectionName, String screenTealiumKey) {
            Intrinsics.h(screenName, "screenName");
            Intrinsics.h(sectionName, "sectionName");
            Intrinsics.h(screenTealiumKey, "screenTealiumKey");
            this.d = screenName;
            this.e = sectionName;
            this.f = screenTealiumKey;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Screen
        /* renamed from: a, reason: from getter */
        public final String getE() {
            return this.e;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Screen
        /* renamed from: b, reason: from getter */
        public final String getF() {
            return this.f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Screen
        /* renamed from: d, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddToListBottomSheetHostScreen)) {
                return false;
            }
            AddToListBottomSheetHostScreen addToListBottomSheetHostScreen = (AddToListBottomSheetHostScreen) obj;
            return Intrinsics.c(this.d, addToListBottomSheetHostScreen.d) && Intrinsics.c(this.e, addToListBottomSheetHostScreen.e) && Intrinsics.c(this.f, addToListBottomSheetHostScreen.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + androidx.camera.core.impl.b.c(this.d.hashCode() * 31, 31, this.e);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("AddToListBottomSheetHostScreen(screenName=", this.d, ", sectionName=", this.e, ", screenTealiumKey="), this.f, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetFragment$BottomSheetHost;", "", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface BottomSheetHost {
        CoroutineScope A2();

        void E2(ListChangeEvent listChangeEvent);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetFragment$Companion;", "", "", "EXTRAS_PRODUCT_CARD_TILE_DATA", "Ljava/lang/String;", "TAG", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static void a(FragmentManager fragmentManager, String str, Screen hostScreen, List list, CopyFromListParameters copyFromListParameters, ProductInfoViewFactory productInfoViewFactory, boolean z, TrackingMetadata trackingMetadata, String str2, int i) {
            AddToListMode addToListMode = AddToListMode.e;
            String str3 = (i & 2) != 0 ? null : str;
            CopyFromListParameters copyFromListParameters2 = (i & 16) != 0 ? null : copyFromListParameters;
            ProductInfoViewFactory productInfoViewFactory2 = (i & 32) != 0 ? null : productInfoViewFactory;
            TrackingMetadata trackingMetadata2 = (i & 128) != 0 ? null : trackingMetadata;
            if ((i & 256) != 0) {
                addToListMode = AddToListMode.d;
            }
            AddToListMode addToListMode2 = addToListMode;
            String str4 = (i & 512) != 0 ? null : str2;
            Intrinsics.h(hostScreen, "hostScreen");
            if (fragmentManager != null) {
                FragmentTransaction fragmentTransactionE = fragmentManager.e();
                AddToListBottomSheetFragment addToListBottomSheetFragment = new AddToListBottomSheetFragment();
                addToListBottomSheetFragment.setArguments(BundleKt.a(new Pair("EXTRAS_PRODUCT_CARD_TILE_DATA", new Extras(str3, new AddToListBottomSheetHostScreen(hostScreen.getD(), hostScreen.getE(), hostScreen.getF()), list, copyFromListParameters2, productInfoViewFactory2, z, trackingMetadata2, addToListMode2, str4))));
                DialogFragmentExtKt.a(addToListBottomSheetFragment, fragmentManager, "AddToListBottomSheetFragment");
                fragmentTransactionE.f();
            }
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetFragment$Extras;", "Landroid/os/Parcelable;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extras implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        public final String d;
        public final AddToListBottomSheetHostScreen e;
        public final List f;
        public final CopyFromListParameters g;
        public final InfoViewFactory h;
        public final boolean i;
        public final TrackingMetadata j;
        public final AddToListMode k;
        public final String l;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                String string = parcel.readString();
                AddToListBottomSheetHostScreen addToListBottomSheetHostScreenCreateFromParcel = AddToListBottomSheetHostScreen.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = androidx.compose.ui.input.pointer.a.e(AddToListProductParameters.CREATOR, parcel, arrayList, iE, 1);
                }
                return new Extras(string, addToListBottomSheetHostScreenCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : CopyFromListParameters.CREATOR.createFromParcel(parcel), (InfoViewFactory) parcel.readParcelable(Extras.class.getClassLoader()), parcel.readInt() != 0, (TrackingMetadata) parcel.readParcelable(Extras.class.getClassLoader()), AddToListMode.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        public Extras(String str, AddToListBottomSheetHostScreen hostScreen, List list, CopyFromListParameters copyFromListParameters, InfoViewFactory infoViewFactory, boolean z, TrackingMetadata trackingMetadata, AddToListMode addToListMode, String str2) {
            Intrinsics.h(hostScreen, "hostScreen");
            Intrinsics.h(addToListMode, "addToListMode");
            this.d = str;
            this.e = hostScreen;
            this.f = list;
            this.g = copyFromListParameters;
            this.h = infoViewFactory;
            this.i = z;
            this.j = trackingMetadata;
            this.k = addToListMode;
            this.l = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Extras)) {
                return false;
            }
            Extras extras = (Extras) obj;
            return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e) && Intrinsics.c(this.f, extras.f) && Intrinsics.c(this.g, extras.g) && Intrinsics.c(this.h, extras.h) && this.i == extras.i && Intrinsics.c(this.j, extras.j) && this.k == extras.k && Intrinsics.c(this.l, extras.l);
        }

        public final int hashCode() {
            String str = this.d;
            int iD = androidx.camera.core.impl.b.d((((str == null ? 0 : str.hashCode()) * 31) + this.e.hashCode()) * 31, 31, this.f);
            CopyFromListParameters copyFromListParameters = this.g;
            int iHashCode = (iD + (copyFromListParameters == null ? 0 : copyFromListParameters.hashCode())) * 31;
            InfoViewFactory infoViewFactory = this.h;
            int iE = androidx.camera.core.impl.b.e((iHashCode + (infoViewFactory == null ? 0 : infoViewFactory.hashCode())) * 31, 31, this.i);
            TrackingMetadata trackingMetadata = this.j;
            int iHashCode2 = (this.k.hashCode() + ((iE + (trackingMetadata == null ? 0 : trackingMetadata.d.hashCode())) * 31)) * 31;
            String str2 = this.l;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Extras(title=");
            sb.append(this.d);
            sb.append(", hostScreen=");
            sb.append(this.e);
            sb.append(", products=");
            sb.append(this.f);
            sb.append(", copyFromListParameters=");
            sb.append(this.g);
            sb.append(", infoViewFactory=");
            sb.append(this.h);
            sb.append(", displayQuantitySelector=");
            sb.append(this.i);
            sb.append(", trackingMetadata=");
            sb.append(this.j);
            sb.append(", addToListMode=");
            sb.append(this.k);
            sb.append(", originatingListId=");
            return YU.a.o(sb, this.l, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
            this.e.writeToParcel(dest, i);
            Iterator itU = au.com.woolworths.android.onesite.a.u(this.f, dest);
            while (itU.hasNext()) {
                ((AddToListProductParameters) itU.next()).writeToParcel(dest, i);
            }
            CopyFromListParameters copyFromListParameters = this.g;
            if (copyFromListParameters == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                copyFromListParameters.writeToParcel(dest, i);
            }
            dest.writeParcelable(this.h, i);
            dest.writeInt(this.i ? 1 : 0);
            dest.writeParcelable(this.j, i);
            dest.writeString(this.k.name());
            dest.writeString(this.l);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment$onCreate$2", f = "AddToListBottomSheetFragment.kt", l = {93}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment$onCreate$2$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            public final /* synthetic */ AddToListBottomSheetFragment d;

            public AnonymousClass1(AddToListBottomSheetFragment addToListBottomSheetFragment) {
                this.d = addToListBottomSheetFragment;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function b() {
                return new AdaptedFunctionReference(2, this.d, AddToListBottomSheetFragment.class, "handleActions", "handleActions(Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetContract$Actions;)V", 4);
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                Window window;
                View viewFindViewById;
                View view;
                AddToListBottomSheetContract.Actions actions = (AddToListBottomSheetContract.Actions) obj;
                AddToListBottomSheetFragment addToListBottomSheetFragment = this.d;
                Lazy lazy = addToListBottomSheetFragment.i;
                if (actions instanceof AddToListBottomSheetContract.Actions.AddToListSuccess) {
                    ((BottomSheetHost) lazy.getD()).E2(((AddToListBottomSheetContract.Actions.AddToListSuccess) actions).f10106a);
                    addToListBottomSheetFragment.dismiss();
                } else if (actions instanceof AddToListBottomSheetContract.Actions.QuantityCarouselAccessibilityClicked) {
                    Context contextRequireContext = addToListBottomSheetFragment.requireContext();
                    Intrinsics.g(contextRequireContext, "requireContext(...)");
                    if (ContextExtKt.d(contextRequireContext)) {
                        AddToListBottomSheetContract.ViewState viewState = (AddToListBottomSheetContract.ViewState) addToListBottomSheetFragment.Q1().k.e();
                        if (viewState == null || !AddToListBottomSheetContractKt.a(viewState)) {
                            FragmentAddToListBottomSheetBinding fragmentAddToListBottomSheetBinding = addToListBottomSheetFragment.j;
                            if (fragmentAddToListBottomSheetBinding == null) {
                                Intrinsics.p("fragmentBinding");
                                throw null;
                            }
                            view = fragmentAddToListBottomSheetBinding.J;
                            Intrinsics.e(view);
                        } else {
                            FragmentAddToListBottomSheetBinding fragmentAddToListBottomSheetBinding2 = addToListBottomSheetFragment.j;
                            if (fragmentAddToListBottomSheetBinding2 == null) {
                                Intrinsics.p("fragmentBinding");
                                throw null;
                            }
                            view = fragmentAddToListBottomSheetBinding2.H;
                            Intrinsics.e(view);
                        }
                        if (!view.isLaidOut() || view.isLayoutRequested()) {
                            view.addOnLayoutChangeListener(new AddToListBottomSheetFragment$moveAccessibilityFocusIfNeeded$$inlined$doOnLayout$1());
                        } else {
                            view.performAccessibilityAction(64, null);
                        }
                    }
                } else if (actions instanceof AddToListBottomSheetContract.Actions.UpdateListItemSuccess) {
                    addToListBottomSheetFragment.dismiss();
                } else if (actions instanceof AddToListBottomSheetContract.Actions.RemoveListItemSuccess) {
                    ((BottomSheetHost) lazy.getD()).E2(((AddToListBottomSheetContract.Actions.RemoveListItemSuccess) actions).f10110a);
                    addToListBottomSheetFragment.dismiss();
                } else if (actions instanceof AddToListBottomSheetContract.Actions.LaunchCreateShoppingListActivity) {
                    ActivityResultLauncher activityResultLauncher = addToListBottomSheetFragment.n;
                    int i = CreateUpdateShoppingListActivity.A;
                    activityResultLauncher.a(CreateUpdateShoppingListActivity.Companion.a(Activities.CreateUpdateShoppingList.Mode.d, null), null);
                } else if (actions instanceof AddToListBottomSheetContract.Actions.ShowSnackbar) {
                    Text text = ((AddToListBottomSheetContract.Actions.ShowSnackbar) actions).f10111a;
                    Context contextRequireContext2 = addToListBottomSheetFragment.requireContext();
                    Intrinsics.g(contextRequireContext2, "requireContext(...)");
                    CharSequence text2 = text.getText(contextRequireContext2);
                    Dialog dialog = addToListBottomSheetFragment.getDialog();
                    if (dialog != null && (window = dialog.getWindow()) != null && (viewFindViewById = window.findViewById(R.id.content)) != null) {
                        Snackbar.j(null, viewFindViewById, text2, -1).l();
                    }
                } else {
                    if (!(actions instanceof AddToListBottomSheetContract.Actions.DisplayOverlayView)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    FragmentAddToListBottomSheetBinding fragmentAddToListBottomSheetBinding3 = addToListBottomSheetFragment.j;
                    if (fragmentAddToListBottomSheetBinding3 == null) {
                        Intrinsics.p("fragmentBinding");
                        throw null;
                    }
                    FrameLayout overlayView = fragmentAddToListBottomSheetBinding3.G;
                    Intrinsics.g(overlayView, "overlayView");
                    MiscExtKt.a(overlayView);
                }
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
            return AddToListBottomSheetFragment.this.new AnonymousClass2(continuation);
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
                AddToListBottomSheetFragment addToListBottomSheetFragment = AddToListBottomSheetFragment.this;
                Flow flow = addToListBottomSheetFragment.Q1().l;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(addToListBottomSheetFragment);
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

    public AddToListBottomSheetFragment() {
        final AddToListBottomSheetFragment$special$$inlined$viewModels$default$1 addToListBottomSheetFragment$special$$inlined$viewModels$default$1 = new AddToListBottomSheetFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) addToListBottomSheetFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.l = new ViewModelLazy(Reflection.f24268a.b(AddToListBottomSheetViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.h.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.b;
            }
        });
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: au.com.woolworths.shop.addtolist.add.b
            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                Intent intent;
                Activities.CreateUpdateShoppingList.CreateUpdateResult createUpdateResult;
                ActivityResult result = (ActivityResult) obj;
                Intrinsics.h(result, "result");
                if (result.d != -1 || (intent = result.e) == null || (createUpdateResult = (Activities.CreateUpdateShoppingList.CreateUpdateResult) intent.getParcelableExtra("EXTRA_RESULT")) == null || !createUpdateResult.d) {
                    return;
                }
                AddToListBottomSheetViewModel addToListBottomSheetViewModelQ1 = this.d.Q1();
                BuildersKt.c(ViewModelKt.a(addToListBottomSheetViewModelQ1), null, null, new AddToListBottomSheetViewModel$fetchLists$1(addToListBottomSheetViewModelQ1, null), 3);
                addToListBottomSheetViewModelQ1.D6(new AddToListBottomSheetActions.NewListCreated(addToListBottomSheetViewModelQ1.v6()));
                addToListBottomSheetViewModelQ1.j.f(new AddToListBottomSheetContract.Actions.ShowSnackbar(new ResText(com.woolworths.R.string.shop_lists_new_list_created)));
            }
        });
        Intrinsics.g(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.n = activityResultLauncherRegisterForActivityResult;
    }

    public final AddToListBottomSheetViewModel Q1() {
        return (AddToListBottomSheetViewModel) this.l.getD();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialog) {
        Intrinsics.h(dialog, "dialog");
        ((BottomSheetHost) this.i.getD()).getClass();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Extras extras;
        super.onCreate(bundle);
        this.k = new AddToListBottomSheetEpoxyController(Q1());
        Bundle arguments = getArguments();
        if (arguments == null || (extras = (Extras) arguments.getParcelable("EXTRAS_PRODUCT_CARD_TILE_DATA")) == null) {
            throw new IllegalArgumentException("Product card tile data parcelable argument must be provided");
        }
        AddToListBottomSheetViewModel addToListBottomSheetViewModelQ1 = Q1();
        String str = extras.d;
        AddToListBottomSheetHostScreen hostScreen = extras.e;
        CoroutineScope hostCoroutineScope = ((BottomSheetHost) this.i.getD()).A2();
        List list = extras.f;
        CopyFromListParameters copyFromListParameters = extras.g;
        boolean z = extras.i;
        TrackingMetadata trackingMetadata = extras.j;
        AddToListMode addToListMode = extras.k;
        String str2 = extras.l;
        Intrinsics.h(hostScreen, "hostScreen");
        Intrinsics.h(hostCoroutineScope, "hostCoroutineScope");
        Intrinsics.h(addToListMode, "addToListMode");
        if (list.isEmpty()) {
            throw new IllegalArgumentException("At least one product should be passed!");
        }
        if (list.size() > 1 && z) {
            throw new IllegalArgumentException("QuantitySelector can only be displayed if a single product is passed!");
        }
        addToListBottomSheetViewModelQ1.m = str;
        addToListBottomSheetViewModelQ1.n = hostScreen;
        addToListBottomSheetViewModelQ1.q = hostCoroutineScope;
        addToListBottomSheetViewModelQ1.o = trackingMetadata;
        addToListBottomSheetViewModelQ1.r = list;
        AddToListProductParameters addToListProductParameters = (AddToListProductParameters) CollectionsKt.F(list);
        BuildersKt.c(ViewModelKt.a(addToListBottomSheetViewModelQ1), null, null, new AddToListBottomSheetViewModel$saveProductListItem$1(addToListBottomSheetViewModelQ1, addToListProductParameters != null ? addToListProductParameters.e : null, null), 3);
        addToListBottomSheetViewModelQ1.p = copyFromListParameters;
        addToListBottomSheetViewModelQ1.w = str2;
        AddToListBottomSheetViewModel.E6(addToListBottomSheetViewModelQ1, addToListBottomSheetViewModelQ1.i, addToListBottomSheetViewModelQ1.y6(), null, 0, 0, null, z, null, addToListMode, 94);
        this.m = extras.h;
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass2(null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        ProductInfoView productInfoViewX1;
        Intrinsics.h(inflater, "inflater");
        FragmentAddToListBottomSheetBinding fragmentAddToListBottomSheetBinding = (FragmentAddToListBottomSheetBinding) DataBindingUtil.c(inflater, com.woolworths.R.layout.fragment_add_to_list_bottom_sheet, viewGroup, false, null);
        fragmentAddToListBottomSheetBinding.D(getViewLifecycleOwner());
        fragmentAddToListBottomSheetBinding.N(Q1());
        fragmentAddToListBottomSheetBinding.M(Q1().w6());
        InfoViewFactory infoViewFactory = this.m;
        if (infoViewFactory != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
            productInfoViewX1 = infoViewFactory.x1(fragmentActivityRequireActivity);
            productInfoViewX1.setBoostViewListener(Q1());
            Q1().v = true;
        } else {
            productInfoViewX1 = null;
        }
        fragmentAddToListBottomSheetBinding.L(productInfoViewX1);
        EpoxyRecyclerView epoxyRecyclerView = fragmentAddToListBottomSheetBinding.I;
        AddToListBottomSheetEpoxyController addToListBottomSheetEpoxyController = this.k;
        if (addToListBottomSheetEpoxyController == null) {
            Intrinsics.p("epoxyController");
            throw null;
        }
        epoxyRecyclerView.setController(addToListBottomSheetEpoxyController);
        this.j = fragmentAddToListBottomSheetBinding;
        Q1().k.f(getViewLifecycleOwner(), new AddToListBottomSheetFragment$sam$androidx_lifecycle_Observer$0(new c(this)));
        AddToListBottomSheetViewModel addToListBottomSheetViewModelQ1 = Q1();
        BuildersKt.c(ViewModelKt.a(addToListBottomSheetViewModelQ1), null, null, new AddToListBottomSheetViewModel$fetchLists$1(addToListBottomSheetViewModelQ1, null), 3);
        AddToListBottomSheetViewModel addToListBottomSheetViewModelQ12 = Q1();
        AnalyticsManager analyticsManager = addToListBottomSheetViewModelQ12.h;
        AddToListBottomSheetContract.ViewState viewState = (AddToListBottomSheetContract.ViewState) addToListBottomSheetViewModelQ12.k.e();
        if (viewState == null || viewState.h != AddToListMode.d) {
            if (addToListBottomSheetViewModelQ12.s != null) {
                analyticsManager.c(new AddToListBottomSheetActions.UpdateQuantitySheetLaunch(addToListBottomSheetViewModelQ12.v6()));
            }
        } else if (addToListBottomSheetViewModelQ12.r.size() > 1) {
            analyticsManager.j(new AddToListBottomSheetActions.AddToListSheetLaunch(addToListBottomSheetViewModelQ12.v6()), TrackingMetadata.Companion.a(TrackableValue.R1, Integer.valueOf(addToListBottomSheetViewModelQ12.r.size())));
        } else {
            addToListBottomSheetViewModelQ12.D6(new AddToListBottomSheetActions.AddToListSheetLaunch(addToListBottomSheetViewModelQ12.v6()));
        }
        FragmentAddToListBottomSheetBinding fragmentAddToListBottomSheetBinding2 = this.j;
        if (fragmentAddToListBottomSheetBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        ViewCompat.C(fragmentAddToListBottomSheetBinding2.h, getString(com.woolworths.R.string.product_add_to_list_bottom_sheet_title));
        FragmentAddToListBottomSheetBinding fragmentAddToListBottomSheetBinding3 = this.j;
        if (fragmentAddToListBottomSheetBinding3 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        View view = fragmentAddToListBottomSheetBinding3.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        AddToListBottomSheetViewModel addToListBottomSheetViewModelQ1 = Q1();
        AddToListBottomSheetContract.ViewState viewState = (AddToListBottomSheetContract.ViewState) addToListBottomSheetViewModelQ1.k.e();
        if (viewState == null || viewState.h == AddToListMode.d) {
            addToListBottomSheetViewModelQ1.D6(new AddToListBottomSheetActions.AddToListSheetClose(addToListBottomSheetViewModelQ1.v6()));
        }
    }
}
