package au.com.woolworths.feature.shop.contentpage;

import android.os.Parcelable;
import au.com.woolworths.android.onesite.navigation.Activities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.contentpage.ContentPageViewModel$fetchContentPage$1", f = "ContentPageViewModel.kt", l = {361, 370, 380, 396, 407}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class ContentPageViewModel$fetchContentPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ContentPageViewModel q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Activities.ContentPage.ContentPageType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<Activities.ContentPage.ContentPageType> creator = Activities.ContentPage.ContentPageType.CREATOR;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Parcelable.Creator<Activities.ContentPage.ContentPageType> creator2 = Activities.ContentPage.ContentPageType.CREATOR;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Parcelable.Creator<Activities.ContentPage.ContentPageType> creator3 = Activities.ContentPage.ContentPageType.CREATOR;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Parcelable.Creator<Activities.ContentPage.ContentPageType> creator4 = Activities.ContentPage.ContentPageType.CREATOR;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Parcelable.Creator<Activities.ContentPage.ContentPageType> creator5 = Activities.ContentPage.ContentPageType.CREATOR;
                iArr[7] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Parcelable.Creator<Activities.ContentPage.ContentPageType> creator6 = Activities.ContentPage.ContentPageType.CREATOR;
                iArr[8] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Parcelable.Creator<Activities.ContentPage.ContentPageType> creator7 = Activities.ContentPage.ContentPageType.CREATOR;
                iArr[9] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Parcelable.Creator<Activities.ContentPage.ContentPageType> creator8 = Activities.ContentPage.ContentPageType.CREATOR;
                iArr[10] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Parcelable.Creator<Activities.ContentPage.ContentPageType> creator9 = Activities.ContentPage.ContentPageType.CREATOR;
                iArr[11] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                Parcelable.Creator<Activities.ContentPage.ContentPageType> creator10 = Activities.ContentPage.ContentPageType.CREATOR;
                iArr[12] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                Parcelable.Creator<Activities.ContentPage.ContentPageType> creator11 = Activities.ContentPage.ContentPageType.CREATOR;
                iArr[14] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                Parcelable.Creator<Activities.ContentPage.ContentPageType> creator12 = Activities.ContentPage.ContentPageType.CREATOR;
                iArr[13] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                Parcelable.Creator<Activities.ContentPage.ContentPageType> creator13 = Activities.ContentPage.ContentPageType.CREATOR;
                iArr[16] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                Parcelable.Creator<Activities.ContentPage.ContentPageType> creator14 = Activities.ContentPage.ContentPageType.CREATOR;
                iArr[5] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                Parcelable.Creator<Activities.ContentPage.ContentPageType> creator15 = Activities.ContentPage.ContentPageType.CREATOR;
                iArr[15] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                Parcelable.Creator<Activities.ContentPage.ContentPageType> creator16 = Activities.ContentPage.ContentPageType.CREATOR;
                iArr[6] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                Parcelable.Creator<Activities.ContentPage.ContentPageType> creator17 = Activities.ContentPage.ContentPageType.CREATOR;
                iArr[17] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentPageViewModel$fetchContentPage$1(ContentPageViewModel contentPageViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = contentPageViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ContentPageViewModel$fetchContentPage$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ContentPageViewModel$fetchContentPage$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0136, code lost:
    
        if (r0 == r1) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0241 A[Catch: ServerErrorException -> 0x022f, NoConnectivityException -> 0x0233, TRY_ENTER, TRY_LEAVE, TryCatch #6 {ServerErrorException -> 0x022f, blocks: (B:98:0x0207, B:100:0x020f, B:102:0x0217, B:108:0x0239, B:110:0x0241, B:112:0x0245, B:93:0x01f5, B:95:0x01f9), top: B:173:0x01f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0245 A[Catch: ServerErrorException -> 0x022f, NoConnectivityException -> 0x0250, TRY_ENTER, TRY_LEAVE, TryCatch #6 {ServerErrorException -> 0x022f, blocks: (B:98:0x0207, B:100:0x020f, B:102:0x0217, B:108:0x0239, B:110:0x0241, B:112:0x0245, B:93:0x01f5, B:95:0x01f9), top: B:173:0x01f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0252 A[Catch: ServerErrorException -> 0x024a, NoConnectivityException -> 0x024c, TryCatch #17 {NoConnectivityException -> 0x024c, ServerErrorException -> 0x024a, blocks: (B:114:0x0249, B:119:0x0252, B:120:0x0256, B:135:0x0281, B:136:0x0289, B:137:0x028a, B:138:0x0292), top: B:182:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x020f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f9 A[Catch: ServerErrorException -> 0x022f, NoConnectivityException -> 0x0250, TryCatch #6 {ServerErrorException -> 0x022f, blocks: (B:98:0x0207, B:100:0x020f, B:102:0x0217, B:108:0x0239, B:110:0x0241, B:112:0x0245, B:93:0x01f5, B:95:0x01f9), top: B:173:0x01f5 }] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [au.com.woolworths.android.onesite.models.text.Text, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v62 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.contentpage.ContentPageViewModel$fetchContentPage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
