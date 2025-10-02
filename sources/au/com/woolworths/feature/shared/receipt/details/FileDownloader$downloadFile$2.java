package au.com.woolworths.feature.shared.receipt.details;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shared.receipt.details.FileDownloader$downloadFile$2", f = "FileDownloader.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FileDownloader$downloadFile$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    public final /* synthetic */ String p;
    public final /* synthetic */ FileDownloader q;
    public final /* synthetic */ File r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileDownloader$downloadFile$2(String str, FileDownloader fileDownloader, File file, Continuation continuation) {
        super(2, continuation);
        this.p = str;
        this.q = fileDownloader;
        this.r = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FileDownloader$downloadFile$2(this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FileDownloader$downloadFile$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        Request.Builder builder = new Request.Builder();
        builder.h(this.p);
        Response responseExecute = FirebasePerfOkHttpClient.execute(this.q.f6557a.a(new Request(builder)));
        File file = this.r;
        try {
            if (!responseExecute.s) {
                throw new IOException("Failed to download file: " + responseExecute);
            }
            file.createNewFile();
            ResponseBody responseBody = responseExecute.j;
            Intrinsics.e(responseBody);
            FilesKt.g(file, responseBody.a());
            String absolutePath = file.getAbsolutePath();
            responseExecute.close();
            return absolutePath;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.a(responseExecute, th);
                throw th2;
            }
        }
    }
}
