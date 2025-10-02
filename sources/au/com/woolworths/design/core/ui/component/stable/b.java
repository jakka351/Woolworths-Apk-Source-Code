package au.com.woolworths.design.core.ui.component.stable;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.wallet.digipay.framesview.EpoxyCardCaptureFramesView;
import au.com.woolworths.base.wallet.digipay.framesview.cardcapture.FramesCardCaptureHtml;
import au.com.woolworths.feature.rewards.everydayextras.signup.databinding.LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding;
import com.woolworths.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ b(Function1 function1, boolean z) {
        this.d = 2;
        this.f = z;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Function1 function1 = this.e;
        boolean z = this.f;
        switch (i) {
            case 0:
                CheckBoxState it = (CheckBoxState) obj;
                Intrinsics.h(it, "it");
                function1.invoke(Boolean.valueOf(!z));
                return unit;
            case 1:
                CheckBoxState it2 = (CheckBoxState) obj;
                Intrinsics.h(it2, "it");
                function1.invoke(Boolean.valueOf(!z));
                return unit;
            default:
                Context context = (Context) obj;
                Intrinsics.h(context, "context");
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
                int i2 = LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding.z;
                DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
                LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding layoutEverydayExtrasWpaySchemeCardInputWebViewBinding = (LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.layout_everyday_extras_wpay_scheme_card_input_web_view, null, false, null);
                EpoxyCardCaptureFramesView epoxyCardCaptureFramesView = layoutEverydayExtrasWpaySchemeCardInputWebViewBinding.y;
                String str = z ? "\n    let options = {\n    'height': '48px',\n    'cardNo': {\n        'cardType': {\n            'layout': 'left',\n            'style': {\n                'width': '32px'\n            },\n        },\n        'style': {\n            'fontStyle': 'normal',\n            'font-family': '-apple-system, sans-serif;'\n        }\n    },\n    'style': {\n        'fontSize': '16px',\n        'fontStyle': 'normal',\n        'font-family': '-apple-system, sans-serif;',\n        'color': '#3A474E'\n    },\n    \"css\" : `\n        input::placeholder {\n            color: #3A474E;\n        }\n\n        input:focus { outline: none; }\n        \n        .card-element { border: 1px solid white; }\n    `\n};\n" : "\n    let options = {\n    'height': '48px',\n    'cardNo': {\n        'cardType': {\n            'layout': 'left',\n            'style': {\n                'width': '32px'\n            },\n        },\n        'style': {\n            'fontStyle': 'normal',\n            'font-family': '-apple-system, sans-serif;'\n        }\n    },\n    'style': {\n        'padding-left': '6px',\n        'padding-right': '6px',\n        'fontSize': '16px',\n        'fontStyle': 'normal',\n        'font-family': '-apple-system, sans-serif;',\n        'color': '#3A474E'\n    },\n    \"css\" : `\n        input::placeholder {\n            color: #3A474E;\n        }\n\n        input:focus { outline: none; }\n    `\n};\n";
                epoxyCardCaptureFramesView.n = new FramesCardCaptureHtml("\n    <html>\n       <head> \n    <style>\n        .woolies-element.element-container {\n            float: left;\n            width: 100%;\n            border: solid 1px #959595;\n            border-radius: 2px;\n            background-color: #FFFFFF\n        }\n        \n        .woolies-element.error {\n            float: left;\n            border: solid 1px #BD161C;\n            border-radius: 2px;\n        }\n        \n        .column-left {\n            width: 100%;\n            display: flex;\n            flex-direction: column;\n            margin-right: 4px;\n            justify-content: center\n        }\n        \n        .column-right {\n            width: 100%;\n            display: flex;\n            flex-direction: column;\n            margin-left: 4px;\n            justify-content: center\n        }\n        \n        .row {\n            width: 100%;\n            display: flex;\n            flex-direction: row;\n            margin-bottom: 8px;\n            margin-top: 8px;\n            justify-content: center;\n        }\n        \n        #cardCVVElement,\n        #cardExpiryElement,\n        #cardNumberElement {\n            float: left;\n            width: 100%\n        }\n        \n        #ocr-button {\n            width:24px;\n            height: 24px;\n            position: absolute;\n            right: 20px;\n            top: 22px;\n        }\n        \n        .cardPadding {\n            padding-left: 2px;\n            padding-right: 2px;\n        }\n        </style>\n </head>\n       <body>\n          <div class='cardPadding'>\n             <div class='row'>\n                <div id='cardNumberElement'></div>\n             </div>\n          </div>\n          <div class='row'>\n             <div class='column-left cardPadding'>\n                <div id='cardExpiryElement'></div>\n             </div>\n             <div class='column-right cardPadding'>\n                <div id='cardCVVElement'></div>\n             </div>\n          </div>\n       </body>\n    </html>\n", "\n    <style>\n        .woolies-element.element-container {\n            float: left;\n            width: 100%;\n            border: solid 1px #959595;\n            border-radius: 2px;\n            background-color: #FFFFFF\n        }\n        \n        .woolies-element.error {\n            float: left;\n            border: solid 1px #BD161C;\n            border-radius: 2px;\n        }\n        \n        .column-left {\n            width: 100%;\n            display: flex;\n            flex-direction: column;\n            margin-right: 4px;\n            justify-content: center\n        }\n        \n        .column-right {\n            width: 100%;\n            display: flex;\n            flex-direction: column;\n            margin-left: 4px;\n            justify-content: center\n        }\n        \n        .row {\n            width: 100%;\n            display: flex;\n            flex-direction: row;\n            margin-bottom: 8px;\n            margin-top: 8px;\n            justify-content: center;\n        }\n        \n        #cardCVVElement,\n        #cardExpiryElement,\n        #cardNumberElement {\n            float: left;\n            width: 100%\n        }\n        \n        #ocr-button {\n            width:24px;\n            height: 24px;\n            position: absolute;\n            right: 20px;\n            top: 22px;\n        }\n        \n        .cardPadding {\n            padding-left: 2px;\n            padding-right: 2px;\n        }\n        </style>\n");
                epoxyCardCaptureFramesView.m = str;
                function1.invoke(layoutEverydayExtrasWpaySchemeCardInputWebViewBinding);
                return layoutEverydayExtrasWpaySchemeCardInputWebViewBinding.h;
        }
    }

    public /* synthetic */ b(Function1 function1, boolean z, int i) {
        this.d = i;
        this.e = function1;
        this.f = z;
    }
}
