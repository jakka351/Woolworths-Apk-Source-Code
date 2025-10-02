package me.oriient.internal.infra.utils.core;

import androidx.annotation.Keep;
import java.lang.Exception;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\f\b\u0001\u0010\u0002*\u00060\u0003j\u0002`\u00042\u00020\u0005:\u0002\u0002\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0006J\r\u0010\u000b\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\fJ%\u0010\r\u001a\u00028\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00100\u000fH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0011J,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0002\u0010\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00130\u000fJ4\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00160\u0000\"\f\b\u0002\u0010\u0016*\u00060\u0003j\u0002`\u00042\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H\u00160\u000fJ\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00010\u0000J,\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00180\u000fH\u0086\bø\u0001\u0000J,\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180\u000fH\u0086\bø\u0001\u0000J\r\u0010\u001c\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u001dJP\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0002\u0010\u00132.\u0010\u001a\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u00028\u00010\u00000 \u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001fH\u0086@¢\u0006\u0002\u0010!R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0012\u0010\n\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\t\u0082\u0001\u0002\"#\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"Lme/oriient/internal/infra/utils/core/Outcome;", "Success", "Failure", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "()V", "isFailure", "", "()Z", "isSuccess", "errorOrNull", "()Ljava/lang/Exception;", "guard", "nullClause", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "map", "NewSuccess", "transform", "mapFailure", "NewFailure", "mapToUnit", "", "onFailure", "toExecute", "onSuccess", "successOrNull", "()Ljava/lang/Object;", "then", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/internal/infra/utils/core/Outcome$Failure;", "Lme/oriient/internal/infra/utils/core/Outcome$Success;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class Outcome<Success, Failure extends Exception> {

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u0001*\f\b\u0003\u0010\u0002*\u00060\u0003j\u0002`\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00028\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0013\u0010\u0006\u001a\u00028\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lme/oriient/internal/infra/utils/core/Outcome$Failure;", "Success", "Failure", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lme/oriient/internal/infra/utils/core/Outcome;", "value", "(Ljava/lang/Exception;)V", "isSuccess", "", "()Z", "getValue", "()Ljava/lang/Exception;", "Ljava/lang/Exception;", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Failure<Success, Failure extends Exception> extends Outcome<Success, Failure> {

        @NotNull
        private final Failure value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull Failure value) {
            super(null);
            Intrinsics.h(value, "value");
            this.value = value;
        }

        @NotNull
        public final Failure getValue() {
            return this.value;
        }

        @Override // me.oriient.internal.infra.utils.core.Outcome
        public boolean isSuccess() {
            return false;
        }

        @NotNull
        public String toString() {
            return "Failure(value=" + this.value + ')';
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u0001*\f\b\u0003\u0010\u0002*\u00060\u0003j\u0002`\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00028\u0002¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0013\u0010\u0006\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lme/oriient/internal/infra/utils/core/Outcome$Success;", "Success", "Failure", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lme/oriient/internal/infra/utils/core/Outcome;", "value", "(Ljava/lang/Object;)V", "isSuccess", "", "()Z", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Success<Success, Failure extends Exception> extends Outcome<Success, Failure> {
        private final Success value;

        public Success(Success success) {
            super(null);
            this.value = success;
        }

        public final Success getValue() {
            return this.value;
        }

        @Override // me.oriient.internal.infra.utils.core.Outcome
        public boolean isSuccess() {
            return true;
        }

        @NotNull
        public String toString() {
            return android.support.v4.media.session.a.s(new StringBuilder("Success(value="), this.value, ')');
        }
    }

    public /* synthetic */ Outcome(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public final Failure errorOrNull() {
        if (this instanceof Failure) {
            return (Failure) ((Failure) this).getValue();
        }
        if (this instanceof Success) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Success guard(@NotNull Function1 nullClause) {
        Intrinsics.h(nullClause, "nullClause");
        if (this instanceof Success) {
            return (Success) ((Success) this).getValue();
        }
        if (!(this instanceof Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        nullClause.invoke(((Failure) this).getValue());
        throw new KotlinNothingValueException();
    }

    public final boolean isFailure() {
        return !isSuccess();
    }

    public abstract boolean isSuccess();

    @NotNull
    public final <NewSuccess> Outcome<NewSuccess, Failure> map(@NotNull Function1<? super Success, ? extends NewSuccess> transform) {
        Intrinsics.h(transform, "transform");
        if (this instanceof Success) {
            return new Success(transform.invoke(((Success) this).getValue()));
        }
        if (this instanceof Failure) {
            return new Failure(((Failure) this).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final <NewFailure extends Exception> Outcome<Success, NewFailure> mapFailure(@NotNull Function1<? super Failure, ? extends NewFailure> transform) {
        Intrinsics.h(transform, "transform");
        if (this instanceof Success) {
            return new Success(((Success) this).getValue());
        }
        if (this instanceof Failure) {
            return new Failure((Exception) transform.invoke(((Failure) this).getValue()));
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final Outcome<Unit, Failure> mapToUnit() {
        if (this instanceof Success) {
            return new Success(Unit.f24250a);
        }
        if (this instanceof Failure) {
            return new Failure(((Failure) this).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final Outcome<Success, Failure> onFailure(@NotNull Function1<? super Failure, Unit> toExecute) {
        Intrinsics.h(toExecute, "toExecute");
        if (this instanceof Failure) {
            toExecute.invoke(((Failure) this).getValue());
        }
        return this;
    }

    @NotNull
    public final Outcome<Success, Failure> onSuccess(@NotNull Function1<? super Success, Unit> toExecute) {
        Intrinsics.h(toExecute, "toExecute");
        if (this instanceof Success) {
            toExecute.invoke(((Success) this).getValue());
        }
        return this;
    }

    @Nullable
    public final Success successOrNull() {
        if (this instanceof Success) {
            return (Success) ((Success) this).getValue();
        }
        if (this instanceof Failure) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    public final <NewSuccess> Object then(@NotNull Function2<? super Success, ? super Continuation<? super Outcome<NewSuccess, Failure>>, ? extends Object> function2, @NotNull Continuation<? super Outcome<NewSuccess, Failure>> continuation) {
        if (this instanceof Success) {
            return function2.invoke(((Success) this).getValue(), continuation);
        }
        if (this instanceof Failure) {
            return new Failure(((Failure) this).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    private Outcome() {
    }
}
