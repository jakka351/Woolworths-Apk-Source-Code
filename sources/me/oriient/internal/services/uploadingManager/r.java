package me.oriient.internal.services.uploadingManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.InternalError;
import me.oriient.internal.infra.utils.core.Outcome;

/* loaded from: classes7.dex */
public final class r extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataUploaderFilesManagerImpl f25645a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(DataUploaderFilesManagerImpl dataUploaderFilesManagerImpl, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f25645a = dataUploaderFilesManagerImpl;
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new r(this.f25645a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.f25645a.getLogger().d("DataUploaderFilesManage", "gzipFile() called with: inputFileName = [" + this.b + "], outputFileName = [" + this.c + ']');
        if (!new File(this.b).exists()) {
            this.f25645a.getLogger().e("DataUploaderFilesManage", "gzipFile: couldn't find input file - " + this.b);
            return new Outcome.Failure(new InternalError("couldn't find input file - " + this.b));
        }
        File orCreateFile = this.f25645a.getOrCreateFile(this.c, true);
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this.b));
            DataUploaderFilesManagerImpl dataUploaderFilesManagerImpl = this.f25645a;
            String str = this.b;
            String str2 = this.c;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(orCreateFile);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(fileOutputStream);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = fileInputStream.read(bArr);
                            if (i <= 0) {
                                dataUploaderFilesManagerImpl.getLogger().d("DataUploaderFilesManage", "gzipFile: successfully zipped " + str + " to " + str2);
                                Outcome.Success success = new Outcome.Success(Unit.f24250a);
                                gZIPOutputStream.close();
                                fileOutputStream.close();
                                fileInputStream.close();
                                return success;
                            }
                            gZIPOutputStream.write(bArr, 0, i);
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            this.f25645a.getLogger().e("DataUploaderFilesManage", "failed to compress file " + this.b, e);
            String message = e.getMessage();
            if (message == null) {
                message = "failed to compress file";
            }
            return new Outcome.Failure(new InternalError(message));
        }
    }
}
