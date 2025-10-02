package au.com.woolworths.shop.lists.ui.snapalist.main;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Base64;
import au.com.woolworths.shop.lists.network.ImageToTextRequest;
import com.woolworths.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/shop/lists/network/ImageToTextRequest;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorViewModel$uploadPhotoAndDelete$1$imageToTextRequest$1", f = "ProcessorViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ProcessorViewModel$uploadPhotoAndDelete$1$imageToTextRequest$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ImageToTextRequest>, Object> {
    public final /* synthetic */ ProcessorViewModel p;
    public final /* synthetic */ Context q;
    public final /* synthetic */ Uri r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessorViewModel$uploadPhotoAndDelete$1$imageToTextRequest$1(ProcessorViewModel processorViewModel, Context context, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.p = processorViewModel;
        this.q = context;
        this.r = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProcessorViewModel$uploadPhotoAndDelete$1$imageToTextRequest$1(this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProcessorViewModel$uploadPhotoAndDelete$1$imageToTextRequest$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        Bitmap bitmap;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ProcessorViewModel processorViewModel = this.p;
        try {
            try {
                bitmap = MediaStore.Images.Media.getBitmap(this.q.getContentResolver(), this.r);
            } catch (IOException unused) {
                processorViewModel.p6(R.string.shop_lists_snap_error_image_retrieval);
                bitmap = null;
            }
            if (bitmap == null) {
                return null;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(90.0f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            Intrinsics.g(bitmapCreateBitmap, "createBitmap(...)");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.e(byteArray);
            Timber.Forest forest = Timber.f27013a;
            forest.h("Compressed Jpeg size: " + (byteArray.length / 1048576.0d) + "MB", new Object[0]);
            String strEncodeToString = Base64.encodeToString(byteArray, 2);
            Intrinsics.e(strEncodeToString);
            return new ImageToTextRequest(strEncodeToString);
        } catch (IOException unused2) {
            processorViewModel.p6(R.string.shop_lists_snap_error_image_retrieval);
            return null;
        }
    }
}
