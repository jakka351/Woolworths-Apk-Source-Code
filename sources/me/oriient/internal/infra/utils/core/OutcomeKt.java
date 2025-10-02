package me.oriient.internal.infra.utils.core;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.utils.core.Outcome;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aH\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0003\"\f\b\u0001\u0010\u0004*\u00060\u0005j\u0002`\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00010\u0002H\u0007\u001ab\u0010\u0000\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\n0\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n\"\f\b\u0002\u0010\u0004*\u00060\u0005j\u0002`\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\u00040\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\u00040\u0001H\u0007\u001a\u0082\u0001\u0010\u0000\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\u000e0\r\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n\"\u0004\b\u0002\u0010\u000e\"\f\b\u0003\u0010\u0004*\u00060\u0005j\u0002`\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\u00040\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\u00040\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u00040\u0001H\u0007\u001aD\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0003\"\f\b\u0001\u0010\u0004*\u00060\u0005j\u0002`\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00010\u0002H\u0007\u001a-\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u0002H\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0001\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001a1\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0012\"\f\b\u0001\u0010\u0004*\u00060\u0005j\u0002`\u0006*\u0002H\u0004H\u0007¢\u0006\u0002\u0010\u0016\u001a1\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0012\"\f\b\u0001\u0010\u0004*\u00060\u0005j\u0002`\u0006*\u0002H\u0012H\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0018"}, d2 = {"combineOutcomes", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Success", "Failure", "Ljava/lang/Exception;", "Lkotlin/Exception;", "outcomes", "Lkotlin/Pair;", "Success1", "Success2", "outcome1", "outcome2", "Lkotlin/Triple;", "Success3", "outcome3", "combine", "toOutcome", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Result;", "(Ljava/lang/Object;)Lme/oriient/internal/infra/utils/core/Outcome;", "toOutcomeFailure", "(Ljava/lang/Exception;)Lme/oriient/internal/infra/utils/core/Outcome;", "toOutcomeSuccess", "internal_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class OutcomeKt {
    @Keep
    @NotNull
    public static final <Success, Failure extends Exception> Outcome<List<Success>, Failure> combine(@NotNull List<? extends Outcome<Success, Failure>> list) {
        Intrinsics.h(list, "<this>");
        return combineOutcomes(list);
    }

    @Keep
    @NotNull
    public static final <Success1, Success2, Failure extends Exception> Outcome<Pair<Success1, Success2>, Failure> combineOutcomes(@NotNull Outcome<Success1, Failure> outcome1, @NotNull Outcome<Success2, Failure> outcome2) {
        Intrinsics.h(outcome1, "outcome1");
        Intrinsics.h(outcome2, "outcome2");
        return outcome1 instanceof Outcome.Failure ? new Outcome.Failure(((Outcome.Failure) outcome1).getValue()) : outcome2 instanceof Outcome.Failure ? new Outcome.Failure(((Outcome.Failure) outcome2).getValue()) : new Outcome.Success(new Pair(((Outcome.Success) outcome1).getValue(), ((Outcome.Success) outcome2).getValue()));
    }

    @Keep
    @NotNull
    public static final <T> Outcome<T, Exception> toOutcome(@NotNull Object obj) {
        Throwable thA = Result.a(obj);
        if (thA != null) {
            return new Outcome.Failure(new Exception(thA));
        }
        if (obj instanceof Result.Failure) {
            obj = null;
        }
        return obj != null ? new Outcome.Success(obj) : new Outcome.Failure(new Exception("failed to convert result"));
    }

    @Keep
    @NotNull
    public static final <T, Failure extends Exception> Outcome<T, Failure> toOutcomeFailure(@NotNull Failure failure) {
        Intrinsics.h(failure, "<this>");
        return new Outcome.Failure(failure);
    }

    @Keep
    @NotNull
    public static final <T, Failure extends Exception> Outcome<T, Failure> toOutcomeSuccess(T t) {
        return new Outcome.Success(t);
    }

    @Keep
    @NotNull
    public static final <Success1, Success2, Success3, Failure extends Exception> Outcome<Triple<Success1, Success2, Success3>, Failure> combineOutcomes(@NotNull Outcome<Success1, Failure> outcome1, @NotNull Outcome<Success2, Failure> outcome2, @NotNull Outcome<Success3, Failure> outcome3) {
        Intrinsics.h(outcome1, "outcome1");
        Intrinsics.h(outcome2, "outcome2");
        Intrinsics.h(outcome3, "outcome3");
        return outcome1 instanceof Outcome.Failure ? new Outcome.Failure(((Outcome.Failure) outcome1).getValue()) : outcome2 instanceof Outcome.Failure ? new Outcome.Failure(((Outcome.Failure) outcome2).getValue()) : outcome3 instanceof Outcome.Failure ? new Outcome.Failure(((Outcome.Failure) outcome3).getValue()) : new Outcome.Success(new Triple(((Outcome.Success) outcome1).getValue(), ((Outcome.Success) outcome2).getValue(), ((Outcome.Success) outcome3).getValue()));
    }

    @Keep
    @NotNull
    public static final <Success, Failure extends Exception> Outcome<List<Success>, Failure> combineOutcomes(@NotNull List<? extends Outcome<Success, Failure>> outcomes) {
        Intrinsics.h(outcomes, "outcomes");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = outcomes.iterator();
        while (it.hasNext()) {
            Outcome outcome = (Outcome) it.next();
            if (outcome instanceof Outcome.Failure) {
                return new Outcome.Failure(((Outcome.Failure) outcome).getValue());
            }
            if (outcome instanceof Outcome.Success) {
                arrayList.add(((Outcome.Success) outcome).getValue());
            }
        }
        return new Outcome.Success(arrayList);
    }
}
