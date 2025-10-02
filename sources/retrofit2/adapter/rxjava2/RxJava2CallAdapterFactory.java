package retrofit2.adapter.rxjava2;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import retrofit2.CallAdapter;
import retrofit2.Response;

/* loaded from: classes2.dex */
public final class RxJava2CallAdapterFactory extends CallAdapter.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final Scheduler f27009a;

    public RxJava2CallAdapterFactory(Scheduler scheduler) {
        this.f27009a = scheduler;
    }

    public static RxJava2CallAdapterFactory d(Scheduler scheduler) {
        if (scheduler != null) {
            return new RxJava2CallAdapterFactory(scheduler);
        }
        throw new NullPointerException("scheduler == null");
    }

    @Override // retrofit2.CallAdapter.Factory
    public final CallAdapter a(Type type, Annotation[] annotationArr) {
        Type typeB;
        boolean z;
        boolean z2;
        Class clsC = CallAdapter.Factory.c(type);
        if (clsC == Completable.class) {
            return new RxJava2CallAdapter(Void.class, this.f27009a, false, true, false, false, false, true);
        }
        boolean z3 = clsC == Flowable.class;
        boolean z4 = clsC == Single.class;
        boolean z5 = clsC == Maybe.class;
        if (clsC != Observable.class && !z3 && !z4 && !z5) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            String str = !z3 ? !z4 ? z5 ? "Maybe" : "Observable" : "Single" : "Flowable";
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type typeB2 = CallAdapter.Factory.b((ParameterizedType) type);
        Class clsC2 = CallAdapter.Factory.c(typeB2);
        if (clsC2 == Response.class) {
            if (!(typeB2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            typeB = CallAdapter.Factory.b((ParameterizedType) typeB2);
            z2 = false;
            z = false;
        } else if (clsC2 != Result.class) {
            typeB = typeB2;
            z = true;
            z2 = false;
        } else {
            if (!(typeB2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
            typeB = CallAdapter.Factory.b((ParameterizedType) typeB2);
            z2 = true;
            z = false;
        }
        return new RxJava2CallAdapter(typeB, this.f27009a, z2, z, z3, z4, z5, false);
    }
}
