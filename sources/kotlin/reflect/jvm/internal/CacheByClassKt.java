package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CacheByClassKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f24275a = 0;

    static {
        Object objA;
        try {
            objA = Class.forName("java.lang.ClassValue");
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        if (!(objA instanceof Result.Failure)) {
            objA = Boolean.TRUE;
        }
        Object obj = Boolean.FALSE;
        if (objA instanceof Result.Failure) {
            objA = obj;
        }
    }
}
