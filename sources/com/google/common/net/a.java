package com.google.common.net;

import androidx.preference.ListPreference;
import androidx.preference.Preference;
import au.com.woolworths.pay.sdk.models.CreditCardInstrument;
import au.com.woolworths.pay.sdk.models.PaymentInstrument;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.google.android.datatransport.Transformer;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableMultiset;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.interop.AppCheckTokenListener;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.firestore.FirebaseFirestoreSettings;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.core.SQLiteComponentProvider;
import com.google.firebase.firestore.util.Listener;
import com.google.firebase.messaging.ProtoEncoderDoNotUse;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import com.medallia.digital.mobilesdk.e6;
import com.scandit.datacapture.core.source.SequenceFrameSource;
import com.scandit.datacapture.core.source.SequenceFrameSourceProcessListener;
import com.scandit.djinni.ResultOrError;
import com.snapchat.djinni.Outcome;
import com.woolworths.scanlibrary.SngViewLandingContentBindingModel_;
import com.woolworths.scanlibrary.domain.payment.GetInstrumentsUC;
import com.woolworths.scanlibrary.domain.payment.GetMerchantProfileUC;
import com.woolworths.scanlibrary.ui.entry.controller.LandingContentController;
import io.grpc.ClientCall;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.internal.InlineParserContextImpl;
import org.commonmark.internal.InlineParserImpl;
import org.commonmark.parser.InlineParserFactory;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Function, Continuation, ImmutableSortedMap.Builder.KeyTranslator, com.google.firebase.firestore.util.Function, AppCheckTokenListener, Listener, OnSuccessListener, Transformer, SequenceFrameSourceProcessListener, ResultOrError.ResultHandler, ResultOrError.ErrorHandler, Outcome.ResultHandler, Outcome.ErrorHandler, Consumer, BiFunction, OnModelUnboundListener, Preference.SummaryProvider, InlineParserFactory {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    @Override // androidx.preference.Preference.SummaryProvider
    public CharSequence a(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        return listPreference.V[listPreference.C(listPreference.X)];
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        switch (this.d) {
            case 19:
                break;
            case 20:
                break;
            default:
                break;
        }
    }

    @Override // com.snapchat.djinni.Outcome.ResultHandler, com.snapchat.djinni.Outcome.ErrorHandler
    public Object apply() {
        switch (this.d) {
        }
        return null;
    }

    @Override // org.commonmark.parser.InlineParserFactory
    public InlineParserImpl b(InlineParserContextImpl inlineParserContextImpl) {
        return new InlineParserImpl(inlineParserContextImpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.firestore.util.Listener
    public void c(User user) {
    }

    @Override // com.airbnb.epoxy.OnModelUnboundListener
    public void e(EpoxyModel epoxyModel, Object obj) {
        LandingContentController.bindContentItem$lambda$9$lambda$8((SngViewLandingContentBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((ClientCall) obj).b();
    }

    @Override // com.scandit.datacapture.core.source.SequenceFrameSourceProcessListener
    public void processingFinished(byte[] bArr) {
        SequenceFrameSource.Companion.a(bArr);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z;
        int i;
        switch (this.d) {
            case 2:
                boolean zIsSuccessful = task.isSuccessful();
                Logger logger = Logger.f15258a;
                if (zIsSuccessful) {
                    CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) task.getResult();
                    logger.b("Crashlytics report successfully enqueued to DataTransport: " + crashlyticsReportWithSessionId.d(), null);
                    File fileC = crashlyticsReportWithSessionId.c();
                    if (fileC.delete()) {
                        logger.b("Deleted report file: " + fileC.getPath(), null);
                    } else {
                        logger.f(null, "Crashlytics could not delete report file: " + fileC.getPath());
                    }
                    z = true;
                } else {
                    logger.f(task.getException(), "Crashlytics report could not be enqueued to DataTransport");
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                return task.isSuccessful() ? Tasks.forResult(((AppCheckTokenResult) task.getResult()).b()) : Tasks.forException(task.getException());
            case 9:
                i = e6.h;
                break;
            default:
                i = -1;
                break;
        }
        return Integer.valueOf(i);
    }

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
    }

    @Override // io.reactivex.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        GetMerchantProfileUC.ResponseValue merchantProfileResponse = (GetMerchantProfileUC.ResponseValue) obj;
        GetInstrumentsUC.ResponseValue instrumentResponse = (GetInstrumentsUC.ResponseValue) obj2;
        Intrinsics.h(merchantProfileResponse, "merchantProfileResponse");
        Intrinsics.h(instrumentResponse, "instrumentResponse");
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : instrumentResponse.f21190a) {
            PaymentInstrument paymentInstrument = (PaymentInstrument) obj3;
            if ((paymentInstrument instanceof CreditCardInstrument) && ((CreditCardInstrument) paymentInstrument).isAllowed() && merchantProfileResponse.f21191a.isCreditCardsAllowed()) {
                arrayList.add(obj3);
            }
        }
        return new GetInstrumentsUC.ResponseValue(arrayList);
    }

    @Override // com.google.common.base.Function
    public Object apply(Object obj) {
        switch (this.d) {
            case 0:
                String str = (String) obj;
                if (MediaType.g.n(str) && !str.isEmpty()) {
                    return str;
                }
                StringBuilder sb = new StringBuilder(str.length() + 16);
                sb.append('\"');
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == '\r' || cCharAt == '\\' || cCharAt == '\"') {
                        sb.append('\\');
                    }
                    sb.append(cCharAt);
                }
                sb.append('\"');
                return sb.toString();
            case 1:
                return ImmutableMultiset.l((Collection) obj);
            case 4:
                FirebaseFirestoreSettings firebaseFirestoreSettings = (FirebaseFirestoreSettings) obj;
                firebaseFirestoreSettings.getClass();
                return new SQLiteComponentProvider(firebaseFirestoreSettings);
            case 11:
                MessagingClientEventExtension messagingClientEventExtension = (MessagingClientEventExtension) obj;
                messagingClientEventExtension.getClass();
                ProtobufEncoder protobufEncoder = ProtoEncoderDoNotUse.f15647a;
                protobufEncoder.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    protobufEncoder.a(messagingClientEventExtension, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 13:
                return ResultOrError.a(obj);
            case 14:
                return ResultOrError.b(obj);
            default:
                return ResultOrError.c(obj);
        }
    }
}
