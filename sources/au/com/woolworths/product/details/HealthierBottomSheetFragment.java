package au.com.woolworths.product.details;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.product.details.HealthierBottomSheetContract;
import au.com.woolworths.product.details.databinding.FragmentHealthierBottomSheetBinding;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/product/details/HealthierBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "Extras", "Companion", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class HealthierBottomSheetFragment extends Hilt_HealthierBottomSheetFragment {
    public final ViewModelLazy i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/product/details/HealthierBottomSheetFragment$Companion;", "", "", "TAG", "Ljava/lang/String;", "EXTRA_DATA", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/HealthierBottomSheetFragment$Extras;", "Landroid/os/Parcelable;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Extras implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Extras> CREATOR = new Creator();
        public final String d;
        public final String e;
        public final ArrayList f;
        public final String g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Extras> {
            @Override // android.os.Parcelable.Creator
            public final Extras createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new Extras(string, string2, parcel.readString(), arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Extras[] newArray(int i) {
                return new Extras[i];
            }
        }

        public Extras(String title, String content, String str, ArrayList arrayList) {
            Intrinsics.h(title, "title");
            Intrinsics.h(content, "content");
            this.d = title;
            this.e = content;
            this.f = arrayList;
            this.g = str;
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
            return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e) && this.f.equals(extras.f) && Intrinsics.c(this.g, extras.g);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(androidx.camera.core.impl.b.c(this.d.hashCode() * 31, 31, this.e), 31, this.f);
            String str = this.g;
            return iB + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("Extras(title=", this.d, ", content=", this.e, ", links=");
            sbV.append(this.f);
            sbV.append(", markdownContent=");
            sbV.append(this.g);
            sbV.append(")");
            return sbV.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
            dest.writeString(this.e);
            ArrayList arrayList = this.f;
            dest.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                dest.writeSerializable((Serializable) it.next());
            }
            dest.writeString(this.g);
        }
    }

    public HealthierBottomSheetFragment() {
        final HealthierBottomSheetFragment$special$$inlined$viewModels$default$1 healthierBottomSheetFragment$special$$inlined$viewModels$default$1 = new HealthierBottomSheetFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.product.details.HealthierBottomSheetFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) healthierBottomSheetFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.i = new ViewModelLazy(Reflection.f24268a.b(HealthierBottomSheetViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.product.details.HealthierBottomSheetFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.product.details.HealthierBottomSheetFragment$special$$inlined$viewModels$default$5
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
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.product.details.HealthierBottomSheetFragment$special$$inlined$viewModels$default$4
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
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        Extras extras = arguments != null ? (Extras) arguments.getParcelable("healthier_extra_data") : null;
        if (extras == null) {
            throw new IllegalArgumentException("healthier bottom sheet data is not provided");
        }
        HealthierBottomSheetViewModel healthierBottomSheetViewModel = (HealthierBottomSheetViewModel) this.i.getD();
        String title = extras.d;
        String content = extras.e;
        ArrayList arrayList = extras.f;
        String str = extras.g;
        Intrinsics.h(title, "title");
        Intrinsics.h(content, "content");
        healthierBottomSheetViewModel.g.m(new HealthierBottomSheetContract.ViewState(title, content, str, arrayList));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        FragmentHealthierBottomSheetBinding fragmentHealthierBottomSheetBinding = (FragmentHealthierBottomSheetBinding) DataBindingUtil.c(inflater, com.woolworths.R.layout.fragment_healthier_bottom_sheet, viewGroup, false, null);
        fragmentHealthierBottomSheetBinding.L(this);
        fragmentHealthierBottomSheetBinding.D(getViewLifecycleOwner());
        fragmentHealthierBottomSheetBinding.M((HealthierBottomSheetViewModel) this.i.getD());
        View view = fragmentHealthierBottomSheetBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }
}
