package au.com.woolworths.shop.lists.ui.magicmatch;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchActivity;
import au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchContract;
import au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchViewModel;
import au.com.woolworths.shop.lists.ui.magicmatch.ui.MagicMatchScreenKt;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.lifecycle.HiltViewModelExtensions;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/magicmatch/MagicMatchActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/shop/lists/ui/magicmatch/MagicMatchContract$Listener;", "<init>", "()V", "Companion", "Lau/com/woolworths/shop/lists/ui/magicmatch/MagicMatchContract$ViewState;", "viewState", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MagicMatchActivity extends Hilt_MagicMatchActivity implements MagicMatchContract.Listener {
    public static final Companion z = new Companion();
    public final Lazy x = LazyKt.b(new Function0() { // from class: au.com.woolworths.shop.lists.ui.magicmatch.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            MagicMatchActivity.Companion companion = MagicMatchActivity.z;
            int i = Build.VERSION.SDK_INT;
            MagicMatchActivity magicMatchActivity = this.d;
            MagicMatchActivity.Companion.Extras extras = i >= 33 ? (MagicMatchActivity.Companion.Extras) magicMatchActivity.getIntent().getParcelableExtra("EXTRAS", MagicMatchActivity.Companion.Extras.class) : (MagicMatchActivity.Companion.Extras) magicMatchActivity.getIntent().getParcelableExtra("EXTRAS");
            if (extras != null) {
                return extras;
            }
            throw new IllegalStateException("must provide required extras");
        }
    });
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(MagicMatchViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchActivity$special$$inlined$assistedViewModels$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchActivity$special$$inlined$assistedViewModels$2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchActivity$special$$inlined$assistedViewModels$3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            CreationExtras defaultViewModelCreationExtras = this.d.getDefaultViewModelCreationExtras();
            final MagicMatchActivity magicMatchActivity = this;
            return HiltViewModelExtensions.a(defaultViewModelCreationExtras, new Function1<MagicMatchViewModel.Factory, ViewModel>() { // from class: au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchActivity$special$$inlined$assistedViewModels$3.1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ((MagicMatchViewModel.Factory) obj).a(((MagicMatchActivity.Companion.Extras) magicMatchActivity.x.getD()).e);
                }
            });
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/lists/ui/magicmatch/MagicMatchActivity$Companion;", "", "", "EXTRAS", "Ljava/lang/String;", "Extras", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/magicmatch/MagicMatchActivity$Companion$Extras;", "Landroid/os/Parcelable;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final byte[] d;
            public final String e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.createByteArray(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(byte[] bitmapByteArray, String listId) {
                Intrinsics.h(bitmapByteArray, "bitmapByteArray");
                Intrinsics.h(listId, "listId");
                this.d = bitmapByteArray;
                this.e = listId;
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
                return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + (Arrays.hashCode(this.d) * 31);
            }

            public final String toString() {
                return YU.a.j("Extras(bitmapByteArray=", Arrays.toString(this.d), ", listId=", this.e, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeByteArray(this.d);
                dest.writeString(this.e);
            }
        }

        public static Intent a(Context context, String str, byte[] bitmapByteArray) {
            Intrinsics.h(context, "context");
            Intrinsics.h(bitmapByteArray, "bitmapByteArray");
            Intent intent = new Intent(context, (Class<?>) MagicMatchActivity.class);
            intent.putExtra("EXTRAS", new Extras(bitmapByteArray, str));
            return intent;
        }
    }

    @Override // au.com.woolworths.shop.lists.ui.magicmatch.Hilt_MagicMatchActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new MagicMatchActivity$handleActions$1(this, null), 3);
        MagicMatchViewModel magicMatchViewModel = (MagicMatchViewModel) this.y.getD();
        MutableStateFlow mutableStateFlow = magicMatchViewModel.h;
        ((MagicMatchContract.ViewState) mutableStateFlow.getValue()).getClass();
        mutableStateFlow.setValue(new MagicMatchContract.ViewState(true));
        BuildersKt.c(ViewModelKt.a(magicMatchViewModel), null, null, new MagicMatchViewModel$getMatchedProducts$2(magicMatchViewModel, null), 3);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchActivity$setUiContent$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    MagicMatchActivity.Companion companion = MagicMatchActivity.z;
                    final MagicMatchActivity magicMatchActivity = this.d;
                    final MutableState mutableStateA = SnapshotStateKt.a(((MagicMatchViewModel) magicMatchActivity.y.getD()).h, composer);
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(2110887694, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchActivity$setUiContent$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                MagicMatchContract.ViewState viewState = (MagicMatchContract.ViewState) mutableStateA.getD();
                                MagicMatchActivity magicMatchActivity2 = magicMatchActivity;
                                MagicMatchScreenKt.a(viewState, ((MagicMatchActivity.Companion.Extras) magicMatchActivity2.x.getD()).d, magicMatchActivity2, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1048042518));
    }

    @Override // au.com.woolworths.shop.lists.ui.magicmatch.MagicMatchContract.Listener
    public final void s() {
        ((MagicMatchViewModel) this.y.getD()).i.f(MagicMatchContract.Action.FinishWithResult.f12355a);
    }
}
