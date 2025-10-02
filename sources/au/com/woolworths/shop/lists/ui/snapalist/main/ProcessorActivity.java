package au.com.woolworths.shop.lists.ui.snapalist.main;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.MediaStore;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.supers.lists.SnapAListAnalytics;
import au.com.woolworths.analytics.supers.lists.SnapAListAnalytics$ListDetails$Action$Companion$cameraPermissionDialogClick$1;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.shop.cart.ui.cart.l;
import au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorActivity;
import au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorContract;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/snapalist/main/ProcessorActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/shop/lists/ui/snapalist/main/ProcessorContract$Listener;", "<init>", "()V", "Companion", "Lau/com/woolworths/shop/lists/ui/snapalist/main/ProcessorContract$ViewState;", "viewState", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProcessorActivity extends Hilt_ProcessorActivity implements ProcessorContract.Listener {
    public static final Companion C = new Companion();
    public final ActivityResultLauncher A;
    public final ActivityResultLauncher B;
    public CameraCaptureManager x;
    public final Lazy y = LazyKt.b(new b(this, 0));
    public final ViewModelLazy z = new ViewModelLazy(Reflection.f24268a.b(ProcessorViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\t"}, d2 = {"Lau/com/woolworths/shop/lists/ui/snapalist/main/ProcessorActivity$Companion;", "", "", "EXTRAS", "Ljava/lang/String;", "EXTRA_RESULT", "SourceType", "Result", "Extras", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/snapalist/main/ProcessorActivity$Companion$Extras;", "Landroid/os/Parcelable;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final SourceType d;
            public final byte[] e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(SourceType.valueOf(parcel.readString()), parcel.createByteArray());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(SourceType sourceType, byte[] bitmapByteArray) {
                Intrinsics.h(sourceType, "sourceType");
                Intrinsics.h(bitmapByteArray, "bitmapByteArray");
                this.d = sourceType;
                this.e = bitmapByteArray;
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
                return this.d == extras.d && Intrinsics.c(this.e, extras.e);
            }

            public final int hashCode() {
                return Arrays.hashCode(this.e) + (this.d.hashCode() * 31);
            }

            public final String toString() {
                return "Extras(sourceType=" + this.d + ", bitmapByteArray=" + Arrays.toString(this.e) + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d.name());
                dest.writeByteArray(this.e);
            }
        }

        @StabilityInferred
        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/snapalist/main/ProcessorActivity$Companion$Result;", "Landroid/os/Parcelable;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Result implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Result> CREATOR = new Creator();
            public final List d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Result> {
                @Override // android.os.Parcelable.Creator
                public final Result createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Result(parcel.createStringArrayList());
                }

                @Override // android.os.Parcelable.Creator
                public final Result[] newArray(int i) {
                    return new Result[i];
                }
            }

            public Result(List productList) {
                Intrinsics.h(productList, "productList");
                this.d = productList;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Result) && Intrinsics.c(this.d, ((Result) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.l("Result(productList=", ")", this.d);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeStringList(this.d);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/snapalist/main/ProcessorActivity$Companion$SourceType;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SourceType {
            public static final SourceType d;
            public static final SourceType e;
            public static final /* synthetic */ SourceType[] f;
            public static final /* synthetic */ EnumEntries g;

            static {
                SourceType sourceType = new SourceType("CAMERA", 0);
                d = sourceType;
                SourceType sourceType2 = new SourceType("GALLERY", 1);
                e = sourceType2;
                SourceType[] sourceTypeArr = {sourceType, sourceType2};
                f = sourceTypeArr;
                g = EnumEntriesKt.a(sourceTypeArr);
            }

            public static SourceType valueOf(String str) {
                return (SourceType) Enum.valueOf(SourceType.class, str);
            }

            public static SourceType[] values() {
                return (SourceType[]) f.clone();
            }
        }

        public static Intent a(Context context, SourceType sourceType, byte[] bitmapByteArray) {
            Intrinsics.h(sourceType, "sourceType");
            Intrinsics.h(bitmapByteArray, "bitmapByteArray");
            Intent intent = new Intent(context, (Class<?>) ProcessorActivity.class);
            intent.putExtra("EXTRAS", new Extras(sourceType, bitmapByteArray));
            return intent;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Companion.SourceType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Companion.SourceType sourceType = Companion.SourceType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ProcessorActivity() {
        final int i = 0;
        this.A = registerForActivityResult(new ActivityResultContracts.PickVisualMedia(), new ActivityResultCallback(this) { // from class: au.com.woolworths.shop.lists.ui.snapalist.main.c
            public final /* synthetic */ ProcessorActivity e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        Uri uri = (Uri) obj;
                        ProcessorActivity.Companion companion = ProcessorActivity.C;
                        ProcessorActivity processorActivity = this.e;
                        if (uri == null) {
                            processorActivity.finish();
                            return;
                        } else {
                            ProcessorViewModel processorViewModelO4 = processorActivity.O4();
                            BuildersKt.c(ViewModelKt.a(processorViewModelO4), null, null, new ProcessorViewModel$uploadPhotoAndDelete$1(processorViewModelO4, null, processorActivity, uri, null), 3);
                            return;
                        }
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        ProcessorActivity.Companion companion2 = ProcessorActivity.C;
                        ProcessorActivity processorActivity2 = this.e;
                        if (!zBooleanValue) {
                            processorActivity2.finish();
                            return;
                        }
                        CameraCaptureManager cameraCaptureManager = processorActivity2.x;
                        if (cameraCaptureManager == null) {
                            Intrinsics.p("cameraCaptureManager");
                            throw null;
                        }
                        Uri uri2 = cameraCaptureManager.b;
                        if (uri2 != null) {
                            ProcessorViewModel processorViewModelO42 = processorActivity2.O4();
                            BuildersKt.c(ViewModelKt.a(processorViewModelO42), null, null, new ProcessorViewModel$uploadPhotoAndDelete$1(processorViewModelO42, new l(20, processorActivity2, uri2), processorActivity2, uri2, null), 3);
                            return;
                        }
                        return;
                }
            }
        });
        final int i2 = 1;
        this.B = registerForActivityResult(new ActivityResultContracts.TakePicture(), new ActivityResultCallback(this) { // from class: au.com.woolworths.shop.lists.ui.snapalist.main.c
            public final /* synthetic */ ProcessorActivity e;

            {
                this.e = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        Uri uri = (Uri) obj;
                        ProcessorActivity.Companion companion = ProcessorActivity.C;
                        ProcessorActivity processorActivity = this.e;
                        if (uri == null) {
                            processorActivity.finish();
                            return;
                        } else {
                            ProcessorViewModel processorViewModelO4 = processorActivity.O4();
                            BuildersKt.c(ViewModelKt.a(processorViewModelO4), null, null, new ProcessorViewModel$uploadPhotoAndDelete$1(processorViewModelO4, null, processorActivity, uri, null), 3);
                            return;
                        }
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        ProcessorActivity.Companion companion2 = ProcessorActivity.C;
                        ProcessorActivity processorActivity2 = this.e;
                        if (!zBooleanValue) {
                            processorActivity2.finish();
                            return;
                        }
                        CameraCaptureManager cameraCaptureManager = processorActivity2.x;
                        if (cameraCaptureManager == null) {
                            Intrinsics.p("cameraCaptureManager");
                            throw null;
                        }
                        Uri uri2 = cameraCaptureManager.b;
                        if (uri2 != null) {
                            ProcessorViewModel processorViewModelO42 = processorActivity2.O4();
                            BuildersKt.c(ViewModelKt.a(processorViewModelO42), null, null, new ProcessorViewModel$uploadPhotoAndDelete$1(processorViewModelO42, new l(20, processorActivity2, uri2), processorActivity2, uri2, null), 3);
                            return;
                        }
                        return;
                }
            }
        });
    }

    public final ProcessorViewModel O4() {
        return (ProcessorViewModel) this.z.getD();
    }

    @Override // au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorContract.Listener
    public final void P2() {
        AnalyticsManager analyticsManager = O4().g;
        SnapAListAnalytics.ListDetails.Action.d.getClass();
        analyticsManager.g(new SnapAListAnalytics$ListDetails$Action$Companion$cameraPermissionDialogClick$1("allow"));
        CameraCaptureManager cameraCaptureManager = this.x;
        if (cameraCaptureManager == null) {
            Intrinsics.p("cameraCaptureManager");
            throw null;
        }
        if (cameraCaptureManager.a(this.B)) {
            return;
        }
        O4().p6(R.string.shop_lists_snap_error_description_generic);
    }

    @Override // au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorContract.Listener
    public final void Q2() {
        ProcessorViewModel processorViewModelO4 = O4();
        processorViewModelO4.i.f(ProcessorContract.Action.OpenAppSettings.f12459a);
        AnalyticsManager analyticsManager = processorViewModelO4.g;
        SnapAListAnalytics.ListDetails.Action.Companion companion = SnapAListAnalytics.ListDetails.Action.d;
        String string = processorViewModelO4.e.getString(R.string.shop_lists_snap_action_settings);
        Intrinsics.g(string, "getString(...)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        Intrinsics.g(lowerCase, "toLowerCase(...)");
        companion.getClass();
        analyticsManager.g(new SnapAListAnalytics$ListDetails$Action$Companion$cameraPermissionDialogClick$1(lowerCase));
    }

    @Override // au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorContract.Listener
    public final void f0() {
        AnalyticsManager analyticsManager = O4().g;
        SnapAListAnalytics.ListDetails.Action.d.getClass();
        analyticsManager.g(new SnapAListAnalytics$ListDetails$Action$Companion$cameraPermissionDialogClick$1("don't allow"));
        finish();
    }

    @Override // au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorContract.Listener
    public final void g0() {
        ProcessorViewModel processorViewModelO4 = O4();
        AnalyticsManager analyticsManager = processorViewModelO4.g;
        SnapAListAnalytics.ListDetails.Action.Companion companion = SnapAListAnalytics.ListDetails.Action.d;
        String string = processorViewModelO4.e.getString(R.string.shop_lists_snap_action_cancel);
        Intrinsics.g(string, "getString(...)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        Intrinsics.g(lowerCase, "toLowerCase(...)");
        companion.getClass();
        analyticsManager.g(new SnapAListAnalytics$ListDetails$Action$Companion$cameraPermissionDialogClick$1(lowerCase));
        finish();
    }

    @Override // au.com.woolworths.shop.lists.ui.snapalist.main.Hilt_ProcessorActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(1);
        getWindow().setFlags(512, 512);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new ProcessorActivity$handleActions$1(this, null), 3);
        int iOrdinal = ((Companion.Extras) this.y.getD()).d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            int pickImagesMaxLimit = ActivityResultContracts.PickVisualMedia.Companion.c() ? MediaStore.getPickImagesMaxLimit() : Integer.MAX_VALUE;
            PickVisualMediaRequest.Builder builder = new PickVisualMediaRequest.Builder();
            ActivityResultContracts.PickVisualMedia.ImageAndVideo imageAndVideo = ActivityResultContracts.PickVisualMedia.ImageAndVideo.f86a;
            builder.f83a = imageAndVideo;
            if (ActivityResultContracts.PickVisualMedia.Companion.c()) {
                MediaStore.getPickImagesMaxLimit();
            }
            builder.f83a = ActivityResultContracts.PickVisualMedia.ImageOnly.f87a;
            builder.b = pickImagesMaxLimit;
            ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab photosTab = ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.f85a;
            builder.c = photosTab;
            PickVisualMediaRequest pickVisualMediaRequest = new PickVisualMediaRequest();
            pickVisualMediaRequest.f82a = imageAndVideo;
            pickVisualMediaRequest.b = ActivityResultContracts.PickVisualMedia.Companion.c() ? MediaStore.getPickImagesMaxLimit() : Integer.MAX_VALUE;
            pickVisualMediaRequest.c = photosTab;
            ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType = builder.f83a;
            Intrinsics.h(visualMediaType, "<set-?>");
            pickVisualMediaRequest.f82a = visualMediaType;
            pickVisualMediaRequest.b = builder.b;
            ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab = builder.c;
            Intrinsics.h(defaultTab, "<set-?>");
            pickVisualMediaRequest.c = defaultTab;
            this.A.a(pickVisualMediaRequest, null);
        } else if (checkSelfPermission("android.permission.CAMERA") == 0) {
            CameraCaptureManager cameraCaptureManager = this.x;
            if (cameraCaptureManager == null) {
                Intrinsics.p("cameraCaptureManager");
                throw null;
            }
            if (!cameraCaptureManager.a(this.B)) {
                O4().p6(R.string.shop_lists_snap_error_description_generic);
            }
        } else {
            MutableStateFlow mutableStateFlow = O4().h;
            mutableStateFlow.f(ProcessorContract.ViewState.a((ProcessorContract.ViewState) mutableStateFlow.getValue(), false, true, null, 5));
        }
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorActivity$setUiContent$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    ProcessorActivity.Companion companion = ProcessorActivity.C;
                    final ProcessorActivity processorActivity = this.d;
                    final MutableState mutableStateA = SnapshotStateKt.a(processorActivity.O4().h, composer);
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(373202246, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorActivity$setUiContent$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ProcessorContract.ViewState viewState = (ProcessorContract.ViewState) mutableStateA.getD();
                                ProcessorActivity.Companion companion2 = ProcessorActivity.C;
                                ProcessorActivity processorActivity2 = processorActivity;
                                byte[] bArr = ((ProcessorActivity.Companion.Extras) processorActivity2.y.getD()).e;
                                composer2.o(5004770);
                                boolean zI = composer2.I(processorActivity2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new b(processorActivity2, 1);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                ProcessorScreenKt.b(viewState, bArr, processorActivity2, (Function0) objG, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1183146786));
    }

    @Override // au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorContract.Listener
    public final void p2() {
        Object value;
        MutableStateFlow mutableStateFlow = O4().h;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, ProcessorContract.ViewState.a((ProcessorContract.ViewState) value, false, false, null, 5)));
    }

    @Override // au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorContract.Listener
    public final void s() {
        O4().g.g(SnapAListAnalytics.ListDetails.Action.g);
        finish();
    }
}
