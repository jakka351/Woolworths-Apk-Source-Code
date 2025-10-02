package coil3.gif;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.PostProcessor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Size;
import au.com.woolworths.pay.sdk.models.PaymentInstrument;
import coil3.Extras;
import coil3.ExtrasKt;
import coil3.decode.DecodeUtils;
import coil3.decode.ImageSource;
import coil3.decode.SourceImageSource;
import coil3.decode.StaticImageDecoderKt;
import coil3.gif.internal.FrameDelayRewritingSource;
import coil3.request.ImageRequests_androidKt;
import coil3.request.Options;
import coil3.size.Precision;
import coil3.util.BitmapsKt;
import com.woolworths.scanlibrary.base.message.NotificationMessageReceiver;
import com.woolworths.scanlibrary.models.notification.Notification;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.ui.entry.content.LandingContentAction;
import com.woolworths.scanlibrary.ui.entry.controller.LandingContentController;
import com.woolworths.scanlibrary.ui.home.itemview.views.ItemView;
import com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListContract;
import com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListFragment;
import com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface;
import com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoContract;
import com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoFragment;
import com.woolworths.scanlibrary.ui.scanner.additem.AddItemActivity;
import com.woolworths.scanlibrary.ui.scanner.additem.AddItemContract;
import com.woolworths.scanlibrary.ui.splash.SngInitializerActivity;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.text.Regex;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.internal.EnumDescriptor;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.b;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonNames;
import kotlinx.serialization.json.internal.JsonNamesMapKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.ws.RealWebSocket;
import okio.BufferedSource;
import okio.Okio;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        int i2 = 0;
        Unit unit = Unit.f24250a;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                final AnimatedImageDecoder animatedImageDecoder = (AnimatedImageDecoder) obj2;
                final Ref.BooleanRef booleanRef = (Ref.BooleanRef) obj;
                ImageSource sourceImageSource = animatedImageDecoder.f13101a;
                if (animatedImageDecoder.c && DecodeUtilsKt.a(sourceImageSource.U0())) {
                    sourceImageSource = new SourceImageSource(Okio.c(new FrameDelayRewritingSource(sourceImageSource.U0())), sourceImageSource.getD(), null);
                }
                try {
                    ImageDecoder.Source sourceA = StaticImageDecoderKt.a(sourceImageSource, animatedImageDecoder.b, true);
                    if (sourceA == null) {
                        BufferedSource bufferedSourceU0 = sourceImageSource.U0();
                        try {
                            bufferedSourceU0.request(Long.MAX_VALUE);
                            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((int) bufferedSourceU0.getE().e);
                            while (!bufferedSourceU0.getE().X1()) {
                                bufferedSourceU0.getE().read(byteBufferAllocateDirect);
                            }
                            byteBufferAllocateDirect.flip();
                            bufferedSourceU0.close();
                            sourceA = ImageDecoder.createSource(byteBufferAllocateDirect);
                        } finally {
                        }
                    }
                    Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(sourceA, new ImageDecoder.OnHeaderDecodedListener() { // from class: coil3.gif.AnimatedImageDecoder$decode$lambda$3$lambda$2$$inlined$decodeDrawable$1
                        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                            Size size = imageInfo.getSize();
                            int width = size.getWidth();
                            int height = size.getHeight();
                            Options options = animatedImageDecoder.b;
                            long jA = DecodeUtils.a(width, height, options.b, options.c, (coil3.size.Size) ExtrasKt.b(options, coil3.request.ImageRequestsKt.f13141a));
                            int i3 = (int) (jA >> 32);
                            int i4 = (int) (jA & 4294967295L);
                            if (width > 0 && height > 0 && (width != i3 || height != i4)) {
                                double dB = DecodeUtils.b(width, height, i3, i4, options.c);
                                boolean z = dB < 1.0d;
                                booleanRef.d = z;
                                if (z || options.d == Precision.d) {
                                    imageDecoder.setTargetSize(MathKt.a(width * dB), MathKt.a(dB * height));
                                }
                            }
                            imageDecoder.setAllocator(BitmapsKt.a(ImageRequests_androidKt.b(options)) ? 3 : 1);
                            imageDecoder.setMemorySizePolicy(!((Boolean) ExtrasKt.b(options, ImageRequests_androidKt.i)).booleanValue() ? 1 : 0);
                            Extras.Key key = ImageRequests_androidKt.d;
                            if (((ColorSpace) ExtrasKt.b(options, key)) != null) {
                                imageDecoder.setTargetColorSpace((ColorSpace) ExtrasKt.b(options, key));
                            }
                            final AnimatedTransformation animatedTransformation = (AnimatedTransformation) ExtrasKt.b(options, ImageRequestsKt.b);
                            imageDecoder.setPostProcessor(animatedTransformation != null ? new PostProcessor() { // from class: coil3.gif.internal.a
                                @Override // android.graphics.PostProcessor
                                public final int onPostProcess(Canvas canvas) {
                                    int iOrdinal = animatedTransformation.a().ordinal();
                                    if (iOrdinal == 0) {
                                        return 0;
                                    }
                                    if (iOrdinal == 1) {
                                        return -3;
                                    }
                                    if (iOrdinal == 2) {
                                        return -1;
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                            } : null);
                        }
                    });
                    AutoCloseableKt.a(sourceImageSource, null);
                    return drawableDecodeDrawable;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AutoCloseableKt.a(sourceImageSource, th);
                        throw th2;
                    }
                }
            case 1:
                ((NotificationMessageReceiver) obj2).b.O0((String) obj);
                return unit;
            case 2:
                return LandingContentController.configureContentItemCta$lambda$10((LandingContentController) obj2, (LandingContentAction) obj);
            case 3:
                ((ItemView) obj2).d().d((Item) obj);
                return unit;
            case 4:
                InstrumentListFragment instrumentListFragment = (InstrumentListFragment) obj2;
                ((InstrumentListContract.Presenter) instrumentListFragment.Q1()).z((PaymentInstrument) obj);
                InstrumentListInterface.InstrumentListCallback instrumentListCallbackH2 = instrumentListFragment.h2();
                if (instrumentListCallbackH2 != null) {
                    instrumentListCallbackH2.q1();
                }
                return unit;
            case 5:
                ((ProductInfoContract.Presenter) ((ProductInfoFragment) obj2).Q1()).d((Item) obj);
                return unit;
            case 6:
                AddItemActivity addItemActivity = (AddItemActivity) obj;
                int i3 = AddItemActivity.I;
                Item item = ((AddItemContract.ViewState.CouponItem) ((AddItemContract.ViewState) obj2)).b;
                if (item != null) {
                    addItemActivity.h4(item);
                } else {
                    addItemActivity.c5();
                }
                return unit;
            case 7:
                SngInitializerActivity sngInitializerActivity = (SngInitializerActivity) obj2;
                int i4 = SngInitializerActivity.G;
                String url = ((Notification) obj).getUrl();
                if (url == null) {
                    url = "https://play.google.com/store/apps/details?id=com.woolworths";
                }
                sngInitializerActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
                sngInitializerActivity.finish();
                return unit;
            case 8:
                return ((Regex) obj2).b(0, (String) obj);
            case 9:
                return SerialDescriptorsKt.d((String) obj2, PolymorphicKind.SEALED.f24761a, new SerialDescriptor[0], new kotlinx.serialization.a((SealedClassSerializer) obj, i2));
            case 10:
                EnumSerializer enumSerializer = (EnumSerializer) obj2;
                String str = (String) obj;
                EnumDescriptor enumDescriptor = enumSerializer.b;
                if (enumDescriptor == null) {
                    Enum[] enumArr = enumSerializer.f24795a;
                    enumDescriptor = new EnumDescriptor(str, enumArr.length);
                    for (Enum r0 : enumArr) {
                        enumDescriptor.k(r0.name(), false);
                    }
                }
                return enumDescriptor;
            case 11:
                return SerialDescriptorsKt.d((String) obj2, StructureKind.OBJECT.f24777a, new SerialDescriptor[0], new b((ObjectSerializer) obj, i2));
            case 12:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj2;
                Json json = (Json) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                JsonConfiguration jsonConfiguration = json.f24836a;
                JsonNamesMapKt.e(serialDescriptor, json);
                int iE = serialDescriptor.getC();
                while (i2 < iE) {
                    List listH = serialDescriptor.h(i2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : listH) {
                        if (obj3 instanceof JsonNames) {
                            arrayList.add(obj3);
                        }
                    }
                    i2++;
                }
                return linkedHashMap.isEmpty() ? EmptyMap.d : linkedHashMap;
            default:
                List list = RealWebSocket.B;
                _UtilCommonKt.b((Closeable) ((Ref.ObjectRef) obj2).d);
                RealWebSocket.Streams streams = (RealWebSocket.Streams) ((Ref.ObjectRef) obj).d;
                if (streams != null) {
                    _UtilCommonKt.b(streams);
                }
                return unit;
        }
    }
}
