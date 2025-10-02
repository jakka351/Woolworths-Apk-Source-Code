package au.com.woolworths.foundation.barcode.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.impl.b;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.foundation.barcode.encoder.BarcodeEncoder;
import au.com.woolworths.foundation.barcode.encoder.BarcodeType;
import au.com.woolworths.foundation.barcode.encoder.BarcodeTypeKt;
import au.com.woolworths.foundation.barcode.ui.BarcodeView;
import au.com.woolworths.foundation.barcode.ui.view.databinding.BarcodeHolderBinding;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lau/com/woolworths/foundation/barcode/ui/BarcodeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "BarcodeSpec", "barcode-ui-view_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BarcodeView extends FrameLayout {
    public final BarcodeHolderBinding d;
    public BarcodeSpec e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/barcode/ui/BarcodeView$BarcodeSpec;", "", "barcode-ui-view_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BarcodeSpec {

        /* renamed from: a, reason: collision with root package name */
        public final String f8480a;
        public final BarcodeType b;
        public final int c;
        public final int d;

        public BarcodeSpec(String content, BarcodeType type, int i, int i2) {
            Intrinsics.h(content, "content");
            Intrinsics.h(type, "type");
            this.f8480a = content;
            this.b = type;
            this.c = i;
            this.d = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BarcodeSpec)) {
                return false;
            }
            BarcodeSpec barcodeSpec = (BarcodeSpec) obj;
            return Intrinsics.c(this.f8480a, barcodeSpec.f8480a) && this.b == barcodeSpec.b && this.c == barcodeSpec.c && this.d == barcodeSpec.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + b.a(this.c, (this.b.hashCode() + (this.f8480a.hashCode() * 31)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BarcodeSpec(content=");
            sb.append(this.f8480a);
            sb.append(", type=");
            sb.append(this.b);
            sb.append(", width=");
            return androidx.compose.ui.input.pointer.a.i(this.c, this.d, ", height=", ")", sb);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodeView(@NotNull Context context) {
        super(context);
        Intrinsics.h(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i = BarcodeHolderBinding.B;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        BarcodeHolderBinding barcodeHolderBinding = (BarcodeHolderBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.barcode_holder, this, true, null);
        Intrinsics.g(barcodeHolderBinding, "inflate(...)");
        this.d = barcodeHolderBinding;
    }

    public final void a(final String content, final BarcodeType type) {
        Intrinsics.h(content, "content");
        Intrinsics.h(type, "type");
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: au.com.woolworths.foundation.barcode.ui.BarcodeView$setBarcode$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view.removeOnLayoutChangeListener(this);
                    BarcodeView barcodeView = this;
                    int width = barcodeView.getWidth();
                    int height = barcodeView.getHeight();
                    String str = content;
                    BarcodeType barcodeType = type;
                    BarcodeView.BarcodeSpec barcodeSpec = new BarcodeView.BarcodeSpec(str, barcodeType, width, height);
                    if (Intrinsics.c(barcodeView.e, barcodeSpec)) {
                        return;
                    }
                    BarcodeHolderBinding barcodeHolderBinding = barcodeView.d;
                    try {
                        barcodeHolderBinding.y.setImageBitmap(BarcodeEncoder.a(str, BarcodeTypeKt.a(barcodeType), barcodeView.getWidth(), barcodeView.getHeight(), MapsKt.i(new Pair(EncodeHintType.i, 0))));
                        barcodeView.e = barcodeSpec;
                        barcodeHolderBinding.L(false);
                    } catch (WriterException e) {
                        Bark.Companion companion = Bark.f8483a;
                        Bark.Barker.c(new ReportOwner(ReportOwner.Squad.d), e, "Failed to generate barcode with content: " + str + " and type: " + barcodeType, 8);
                        barcodeHolderBinding.y.setImageDrawable(null);
                        barcodeView.e = null;
                        barcodeHolderBinding.L(true);
                    }
                    barcodeHolderBinding.l();
                }
            });
            return;
        }
        BarcodeSpec barcodeSpec = new BarcodeSpec(content, type, getWidth(), getHeight());
        if (Intrinsics.c(this.e, barcodeSpec)) {
            return;
        }
        BarcodeHolderBinding barcodeHolderBinding = this.d;
        try {
            barcodeHolderBinding.y.setImageBitmap(BarcodeEncoder.a(content, BarcodeTypeKt.a(type), getWidth(), getHeight(), MapsKt.i(new Pair(EncodeHintType.i, 0))));
            this.e = barcodeSpec;
            barcodeHolderBinding.L(false);
        } catch (WriterException e) {
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.c(new ReportOwner(ReportOwner.Squad.d), e, "Failed to generate barcode with content: " + content + " and type: " + type, 8);
            barcodeHolderBinding.y.setImageDrawable(null);
            this.e = null;
            barcodeHolderBinding.L(true);
        }
        barcodeHolderBinding.l();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodeView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.h(context, "context");
        Intrinsics.h(attrs, "attrs");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i = BarcodeHolderBinding.B;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        BarcodeHolderBinding barcodeHolderBinding = (BarcodeHolderBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.barcode_holder, this, true, null);
        Intrinsics.g(barcodeHolderBinding, "inflate(...)");
        this.d = barcodeHolderBinding;
    }
}
