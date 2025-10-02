package com.scandit.djinni;

import java.util.Objects;

/* loaded from: classes6.dex */
public abstract class ResultOrError<Result, Error> {

    public interface ErrorHandler<R, Error> {
        R apply(Error error);
    }

    public interface ResultHandler<R, Result> {
        R apply(Result result);
    }

    public /* synthetic */ ResultOrError(int i) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object a(Object obj) {
        return null;
    }

    public static <Result, Error> ResultOrError<Result, Error> fromError(Error error) {
        return new b(error);
    }

    public static <Result, Error> ResultOrError<Result, Error> fromResult(Result result) {
        return new a(result);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ResultOrError)) {
            return false;
        }
        ResultOrError resultOrError = (ResultOrError) obj;
        return ((Boolean) match(new f(resultOrError, 0), new f(resultOrError, 1))).booleanValue();
    }

    public Error errorOrNull() {
        return (Error) match(new com.google.common.net.a(13), new com.google.common.net.a(14));
    }

    public int hashCode() {
        Class<?> cls = getClass();
        return ((Integer) match(new g(cls, 0), new g(cls, 1))).intValue();
    }

    public abstract <R> R match(ResultHandler<R, Result> resultHandler, ErrorHandler<R, Error> errorHandler);

    public Result resultOr(Result result) {
        return (Result) match(new com.google.common.net.a(15), new au.com.woolworths.product.details.epoxy.a(result, 25));
    }

    private ResultOrError() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object a(Object obj, Object obj2) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object b(Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean a(ResultOrError resultOrError, Object obj) {
        return Boolean.valueOf(obj.equals(resultOrError.resultOr(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean b(ResultOrError resultOrError, Object obj) {
        return Boolean.valueOf(obj.equals(resultOrError.errorOrNull()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer a(Class cls, Object obj) {
        return Integer.valueOf(Objects.hash(cls, 1, obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer b(Class cls, Object obj) {
        return Integer.valueOf(Objects.hash(cls, 0, obj));
    }
}
