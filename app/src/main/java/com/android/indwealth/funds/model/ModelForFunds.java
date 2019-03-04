package com.android.indwealth.funds.model;

import java.util.List;

public class ModelForFunds {

    /**
     * count : 14160
     * data : [{"InvestNow":{"id":3350,"FundId_id":17,"UniqueNo":"14787","SchemeCode":"KO04D-DP","RTASchemeCode":"04DDP","AmcSchemeCode":"04D","Isin":"INF174K01LL7","AmcCode":"KOTAKMAHINDRAMF","SchemeType":"Hybrid","SchemePlan":"DIRECT","SchemeName":"KOTAK EQUITY HYBRID - DIRECT PLAN - PAYOUT","PurchaseAllowed":"Y","PurchaseTransactionMode":"DP","MinimumPurchaseAmount":5000,"AdditionalPurchaseAmount":1000,"MaximumPurchaseAmount":9999999999,"PurchaseAmountMultiplier":1,"PurchaseCutoffTime":"15:00:00","RedemptionAllowed":"Y","RedemptionTransactionMode":"DP","MinimumRedemptionQty":0.001,"RedemptionQtyMultiplier":0.001,"MaximumRedemptionQty":0,"RedemptionAmountMinimum":1000,"RedemptionAmountMaximum":0,"RedemptionAmountMultiple":0.001,"RedemptionCutoffTime":"15:00:00","RTAAgentCode":"CAMS","AmcActiveFlag":"1","DividendReinvestmentFlag":"N","SipFlag":"Y","StpFlag":"Y","SwpFlag":"Y","SwitchFlag":"Y","SettlementType":"T3","FaceValue":"10.00","StartDate":"2016-11-05","EndDate":"2099-11-05","ExitLoadFlag":"N","ExitLoad":"0","LockinPeriodFlag":"N","LockinPeriod":"0","ChannelPartnerCode":"04D","Active":1},"SipDetails":{"id":7779,"FundId_id":17,"AmcCode":"KOTAKMAHINDRAMF","AmcName":"KOTAK MAHINDRA MUTUAL FUND","SchemeCode":"KO04D-DP","SchemeName":"KOTAK EQUITY HYBRID - DIRECT PLAN - PAYOUT","SipTransactionMode":"DP","SipFrequency":"MONTHLY","SipDates":"1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30","SipMinGap":"0","SipMaxGap":"60","SipInstallmentGap":"0","SipStatus":"1","SipMinInstallmentAmount":1000,"SipMaxInstallmentAmount":999999999,"SipMultiplierAmount":1,"SipMinInstallmentNumbers":6,"SipMaxInstallmentNumbers":9999,"Isin":"INF174K01LL7","SchemeType":"Hybrid","Active":1},"aum":1601,"bearishReturns":{"fiveYear":9.33,"threeYear":7.54,"oneYear":-10.32},"category":"Aggressive Allocation","categoryId":61,"expenseRatio":0.92,"fundType":"Hybrid","id":17,"inceptionDate":"2013-01-01","isDividend":true,"isFmp":false,"isFmpOpen":false,"lumpsumAllowed":true,"lumpsumMinimum":5000,"lumpsumMultiplier":1,"mstarId":"F00000PCYD","name":"Kotak Equity Hybrid Direct Dividend Payout","nav":15.98,"planType":"Direct","projectedReturns":{"fiveYear":10.34,"threeYear":10.34,"oneYear":10.34},"rating":2,"returns":{"oneYear":-4.29812,"threeYear":12.00676,"fiveYear":11.57014},"risk":"Moderately High risk","scores":{"score":0,"returnScore":6.34,"riskScore":4.56,"fmScore":6.77,"tagReturn":"Top 50","tagRisk":"Top 50","rrScore":0},"sipAllowed":true,"sipMinimum":1000,"sipMultiplier":1,"tagIRSensitivity":"","takeCheque":true,"tenure":"fjsdkfk"}]
     */

    private int count;
    private List<DataBean> data;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * InvestNow : {"id":3350,"FundId_id":17,"UniqueNo":"14787","SchemeCode":"KO04D-DP","RTASchemeCode":"04DDP","AmcSchemeCode":"04D","Isin":"INF174K01LL7","AmcCode":"KOTAKMAHINDRAMF","SchemeType":"Hybrid","SchemePlan":"DIRECT","SchemeName":"KOTAK EQUITY HYBRID - DIRECT PLAN - PAYOUT","PurchaseAllowed":"Y","PurchaseTransactionMode":"DP","MinimumPurchaseAmount":5000,"AdditionalPurchaseAmount":1000,"MaximumPurchaseAmount":9999999999,"PurchaseAmountMultiplier":1,"PurchaseCutoffTime":"15:00:00","RedemptionAllowed":"Y","RedemptionTransactionMode":"DP","MinimumRedemptionQty":0.001,"RedemptionQtyMultiplier":0.001,"MaximumRedemptionQty":0,"RedemptionAmountMinimum":1000,"RedemptionAmountMaximum":0,"RedemptionAmountMultiple":0.001,"RedemptionCutoffTime":"15:00:00","RTAAgentCode":"CAMS","AmcActiveFlag":"1","DividendReinvestmentFlag":"N","SipFlag":"Y","StpFlag":"Y","SwpFlag":"Y","SwitchFlag":"Y","SettlementType":"T3","FaceValue":"10.00","StartDate":"2016-11-05","EndDate":"2099-11-05","ExitLoadFlag":"N","ExitLoad":"0","LockinPeriodFlag":"N","LockinPeriod":"0","ChannelPartnerCode":"04D","Active":1}
         * SipDetails : {"id":7779,"FundId_id":17,"AmcCode":"KOTAKMAHINDRAMF","AmcName":"KOTAK MAHINDRA MUTUAL FUND","SchemeCode":"KO04D-DP","SchemeName":"KOTAK EQUITY HYBRID - DIRECT PLAN - PAYOUT","SipTransactionMode":"DP","SipFrequency":"MONTHLY","SipDates":"1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30","SipMinGap":"0","SipMaxGap":"60","SipInstallmentGap":"0","SipStatus":"1","SipMinInstallmentAmount":1000,"SipMaxInstallmentAmount":999999999,"SipMultiplierAmount":1,"SipMinInstallmentNumbers":6,"SipMaxInstallmentNumbers":9999,"Isin":"INF174K01LL7","SchemeType":"Hybrid","Active":1}
         * aum : 1601
         * bearishReturns : {"fiveYear":9.33,"threeYear":7.54,"oneYear":-10.32}
         * category : Aggressive Allocation
         * categoryId : 61
         * expenseRatio : 0.92
         * fundType : Hybrid
         * id : 17
         * inceptionDate : 2013-01-01
         * isDividend : true
         * isFmp : false
         * isFmpOpen : false
         * lumpsumAllowed : true
         * lumpsumMinimum : 5000
         * lumpsumMultiplier : 1
         * mstarId : F00000PCYD
         * name : Kotak Equity Hybrid Direct Dividend Payout
         * nav : 15.98
         * planType : Direct
         * projectedReturns : {"fiveYear":10.34,"threeYear":10.34,"oneYear":10.34}
         * rating : 2
         * returns : {"oneYear":-4.29812,"threeYear":12.00676,"fiveYear":11.57014}
         * risk : Moderately High risk
         * scores : {"score":0,"returnScore":6.34,"riskScore":4.56,"fmScore":6.77,"tagReturn":"Top 50","tagRisk":"Top 50","rrScore":0}
         * sipAllowed : true
         * sipMinimum : 1000
         * sipMultiplier : 1
         * tagIRSensitivity :
         * takeCheque : true
         * tenure : fjsdkfk
         */

        private InvestNowBean InvestNow;
        private SipDetailsBean SipDetails;
        private int aum;
        private BearishReturnsBean bearishReturns;
        private String category;
        private int categoryId;
        private double expenseRatio;
        private String fundType;
        private int id;
        private String inceptionDate;
        private boolean isDividend;
        private boolean isFmp;
        private boolean isFmpOpen;
        private boolean lumpsumAllowed;
        private int lumpsumMinimum;
        private double lumpsumMultiplier;
        private String mstarId;
        private String name;
        private double nav;
        private String planType;
        private ProjectedReturnsBean projectedReturns;
        private int rating;
        private ReturnsBean returns;
        private String risk;
        private ScoresBean scores;
        private boolean sipAllowed;
        private int sipMinimum;
        private int sipMultiplier;
        private String tagIRSensitivity;
        private boolean takeCheque;
        private String tenure;

        public InvestNowBean getInvestNow() {
            return InvestNow;
        }

        public void setInvestNow(InvestNowBean InvestNow) {
            this.InvestNow = InvestNow;
        }

        public SipDetailsBean getSipDetails() {
            return SipDetails;
        }

        public void setSipDetails(SipDetailsBean SipDetails) {
            this.SipDetails = SipDetails;
        }

        public int getAum() {
            return aum;
        }

        public void setAum(int aum) {
            this.aum = aum;
        }

        public BearishReturnsBean getBearishReturns() {
            return bearishReturns;
        }

        public void setBearishReturns(BearishReturnsBean bearishReturns) {
            this.bearishReturns = bearishReturns;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public int getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(int categoryId) {
            this.categoryId = categoryId;
        }

        public double getExpenseRatio() {
            return expenseRatio;
        }

        public void setExpenseRatio(double expenseRatio) {
            this.expenseRatio = expenseRatio;
        }

        public String getFundType() {
            return fundType;
        }

        public void setFundType(String fundType) {
            this.fundType = fundType;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getInceptionDate() {
            return inceptionDate;
        }

        public void setInceptionDate(String inceptionDate) {
            this.inceptionDate = inceptionDate;
        }

        public boolean isIsDividend() {
            return isDividend;
        }

        public void setIsDividend(boolean isDividend) {
            this.isDividend = isDividend;
        }

        public boolean isIsFmp() {
            return isFmp;
        }

        public void setIsFmp(boolean isFmp) {
            this.isFmp = isFmp;
        }

        public boolean isIsFmpOpen() {
            return isFmpOpen;
        }

        public void setIsFmpOpen(boolean isFmpOpen) {
            this.isFmpOpen = isFmpOpen;
        }

        public boolean isLumpsumAllowed() {
            return lumpsumAllowed;
        }

        public void setLumpsumAllowed(boolean lumpsumAllowed) {
            this.lumpsumAllowed = lumpsumAllowed;
        }

        public int getLumpsumMinimum() {
            return lumpsumMinimum;
        }

        public void setLumpsumMinimum(int lumpsumMinimum) {
            this.lumpsumMinimum = lumpsumMinimum;
        }

        public double getLumpsumMultiplier() {
            return lumpsumMultiplier;
        }

        public void setLumpsumMultiplier(double lumpsumMultiplier) {
            this.lumpsumMultiplier = lumpsumMultiplier;
        }

        public String getMstarId() {
            return mstarId;
        }

        public void setMstarId(String mstarId) {
            this.mstarId = mstarId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getNav() {
            return nav;
        }

        public void setNav(double nav) {
            this.nav = nav;
        }

        public String getPlanType() {
            return planType;
        }

        public void setPlanType(String planType) {
            this.planType = planType;
        }

        public ProjectedReturnsBean getProjectedReturns() {
            return projectedReturns;
        }

        public void setProjectedReturns(ProjectedReturnsBean projectedReturns) {
            this.projectedReturns = projectedReturns;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public ReturnsBean getReturns() {
            return returns;
        }

        public void setReturns(ReturnsBean returns) {
            this.returns = returns;
        }

        public String getRisk() {
            return risk;
        }

        public void setRisk(String risk) {
            this.risk = risk;
        }

        public ScoresBean getScores() {
            return scores;
        }

        public void setScores(ScoresBean scores) {
            this.scores = scores;
        }

        public boolean isSipAllowed() {
            return sipAllowed;
        }

        public void setSipAllowed(boolean sipAllowed) {
            this.sipAllowed = sipAllowed;
        }

        public int getSipMinimum() {
            return sipMinimum;
        }

        public void setSipMinimum(int sipMinimum) {
            this.sipMinimum = sipMinimum;
        }

        public int getSipMultiplier() {
            return sipMultiplier;
        }

        public void setSipMultiplier(int sipMultiplier) {
            this.sipMultiplier = sipMultiplier;
        }

        public String getTagIRSensitivity() {
            return tagIRSensitivity;
        }

        public void setTagIRSensitivity(String tagIRSensitivity) {
            this.tagIRSensitivity = tagIRSensitivity;
        }

        public boolean isTakeCheque() {
            return takeCheque;
        }

        public void setTakeCheque(boolean takeCheque) {
            this.takeCheque = takeCheque;
        }

        public String getTenure() {
            return tenure;
        }

        public void setTenure(String tenure) {
            this.tenure = tenure;
        }

        public static class InvestNowBean {
            /**
             * id : 3350
             * FundId_id : 17
             * UniqueNo : 14787
             * SchemeCode : KO04D-DP
             * RTASchemeCode : 04DDP
             * AmcSchemeCode : 04D
             * Isin : INF174K01LL7
             * AmcCode : KOTAKMAHINDRAMF
             * SchemeType : Hybrid
             * SchemePlan : DIRECT
             * SchemeName : KOTAK EQUITY HYBRID - DIRECT PLAN - PAYOUT
             * PurchaseAllowed : Y
             * PurchaseTransactionMode : DP
             * MinimumPurchaseAmount : 5000
             * AdditionalPurchaseAmount : 1000
             * MaximumPurchaseAmount : 9999999999
             * PurchaseAmountMultiplier : 1
             * PurchaseCutoffTime : 15:00:00
             * RedemptionAllowed : Y
             * RedemptionTransactionMode : DP
             * MinimumRedemptionQty : 0.001
             * RedemptionQtyMultiplier : 0.001
             * MaximumRedemptionQty : 0
             * RedemptionAmountMinimum : 1000
             * RedemptionAmountMaximum : 0
             * RedemptionAmountMultiple : 0.001
             * RedemptionCutoffTime : 15:00:00
             * RTAAgentCode : CAMS
             * AmcActiveFlag : 1
             * DividendReinvestmentFlag : N
             * SipFlag : Y
             * StpFlag : Y
             * SwpFlag : Y
             * SwitchFlag : Y
             * SettlementType : T3
             * FaceValue : 10.00
             * StartDate : 2016-11-05
             * EndDate : 2099-11-05
             * ExitLoadFlag : N
             * ExitLoad : 0
             * LockinPeriodFlag : N
             * LockinPeriod : 0
             * ChannelPartnerCode : 04D
             * Active : 1
             */

            private int id;
            private int FundId_id;
            private String UniqueNo;
            private String SchemeCode;
            private String RTASchemeCode;
            private String AmcSchemeCode;
            private String Isin;
            private String AmcCode;
            private String SchemeType;
            private String SchemePlan;
            private String SchemeName;
            private String PurchaseAllowed;
            private String PurchaseTransactionMode;
            private int MinimumPurchaseAmount;
            private int AdditionalPurchaseAmount;
            private long MaximumPurchaseAmount;
            private double PurchaseAmountMultiplier;
            private String PurchaseCutoffTime;
            private String RedemptionAllowed;
            private String RedemptionTransactionMode;
            private double MinimumRedemptionQty;
            private double RedemptionQtyMultiplier;
            private int MaximumRedemptionQty;
            private double RedemptionAmountMinimum;
            private double RedemptionAmountMaximum;
            private double RedemptionAmountMultiple;
            private String RedemptionCutoffTime;
            private String RTAAgentCode;
            private String AmcActiveFlag;
            private String DividendReinvestmentFlag;
            private String SipFlag;
            private String StpFlag;
            private String SwpFlag;
            private String SwitchFlag;
            private String SettlementType;
            private String FaceValue;
            private String StartDate;
            private String EndDate;
            private String ExitLoadFlag;
            private String ExitLoad;
            private String LockinPeriodFlag;
            private String LockinPeriod;
            private String ChannelPartnerCode;
            private int Active;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getFundId_id() {
                return FundId_id;
            }

            public void setFundId_id(int FundId_id) {
                this.FundId_id = FundId_id;
            }

            public String getUniqueNo() {
                return UniqueNo;
            }

            public void setUniqueNo(String UniqueNo) {
                this.UniqueNo = UniqueNo;
            }

            public String getSchemeCode() {
                return SchemeCode;
            }

            public void setSchemeCode(String SchemeCode) {
                this.SchemeCode = SchemeCode;
            }

            public String getRTASchemeCode() {
                return RTASchemeCode;
            }

            public void setRTASchemeCode(String RTASchemeCode) {
                this.RTASchemeCode = RTASchemeCode;
            }

            public String getAmcSchemeCode() {
                return AmcSchemeCode;
            }

            public void setAmcSchemeCode(String AmcSchemeCode) {
                this.AmcSchemeCode = AmcSchemeCode;
            }

            public String getIsin() {
                return Isin;
            }

            public void setIsin(String Isin) {
                this.Isin = Isin;
            }

            public String getAmcCode() {
                return AmcCode;
            }

            public void setAmcCode(String AmcCode) {
                this.AmcCode = AmcCode;
            }

            public String getSchemeType() {
                return SchemeType;
            }

            public void setSchemeType(String SchemeType) {
                this.SchemeType = SchemeType;
            }

            public String getSchemePlan() {
                return SchemePlan;
            }

            public void setSchemePlan(String SchemePlan) {
                this.SchemePlan = SchemePlan;
            }

            public String getSchemeName() {
                return SchemeName;
            }

            public void setSchemeName(String SchemeName) {
                this.SchemeName = SchemeName;
            }

            public String getPurchaseAllowed() {
                return PurchaseAllowed;
            }

            public void setPurchaseAllowed(String PurchaseAllowed) {
                this.PurchaseAllowed = PurchaseAllowed;
            }

            public String getPurchaseTransactionMode() {
                return PurchaseTransactionMode;
            }

            public void setPurchaseTransactionMode(String PurchaseTransactionMode) {
                this.PurchaseTransactionMode = PurchaseTransactionMode;
            }

            public int getMinimumPurchaseAmount() {
                return MinimumPurchaseAmount;
            }

            public void setMinimumPurchaseAmount(int MinimumPurchaseAmount) {
                this.MinimumPurchaseAmount = MinimumPurchaseAmount;
            }

            public int getAdditionalPurchaseAmount() {
                return AdditionalPurchaseAmount;
            }

            public void setAdditionalPurchaseAmount(int AdditionalPurchaseAmount) {
                this.AdditionalPurchaseAmount = AdditionalPurchaseAmount;
            }

            public long getMaximumPurchaseAmount() {
                return MaximumPurchaseAmount;
            }

            public void setMaximumPurchaseAmount(long MaximumPurchaseAmount) {
                this.MaximumPurchaseAmount = MaximumPurchaseAmount;
            }

            public double getPurchaseAmountMultiplier() {
                return PurchaseAmountMultiplier;
            }

            public void setPurchaseAmountMultiplier(double PurchaseAmountMultiplier) {
                this.PurchaseAmountMultiplier = PurchaseAmountMultiplier;
            }

            public String getPurchaseCutoffTime() {
                return PurchaseCutoffTime;
            }

            public void setPurchaseCutoffTime(String PurchaseCutoffTime) {
                this.PurchaseCutoffTime = PurchaseCutoffTime;
            }

            public String getRedemptionAllowed() {
                return RedemptionAllowed;
            }

            public void setRedemptionAllowed(String RedemptionAllowed) {
                this.RedemptionAllowed = RedemptionAllowed;
            }

            public String getRedemptionTransactionMode() {
                return RedemptionTransactionMode;
            }

            public void setRedemptionTransactionMode(String RedemptionTransactionMode) {
                this.RedemptionTransactionMode = RedemptionTransactionMode;
            }

            public double getMinimumRedemptionQty() {
                return MinimumRedemptionQty;
            }

            public void setMinimumRedemptionQty(double MinimumRedemptionQty) {
                this.MinimumRedemptionQty = MinimumRedemptionQty;
            }

            public double getRedemptionQtyMultiplier() {
                return RedemptionQtyMultiplier;
            }

            public void setRedemptionQtyMultiplier(double RedemptionQtyMultiplier) {
                this.RedemptionQtyMultiplier = RedemptionQtyMultiplier;
            }

            public int getMaximumRedemptionQty() {
                return MaximumRedemptionQty;
            }

            public void setMaximumRedemptionQty(int MaximumRedemptionQty) {
                this.MaximumRedemptionQty = MaximumRedemptionQty;
            }

            public double getRedemptionAmountMinimum() {
                return RedemptionAmountMinimum;
            }

            public void setRedemptionAmountMinimum(double RedemptionAmountMinimum) {
                this.RedemptionAmountMinimum = RedemptionAmountMinimum;
            }

            public double getRedemptionAmountMaximum() {
                return RedemptionAmountMaximum;
            }

            public void setRedemptionAmountMaximum(double RedemptionAmountMaximum) {
                this.RedemptionAmountMaximum = RedemptionAmountMaximum;
            }

            public double getRedemptionAmountMultiple() {
                return RedemptionAmountMultiple;
            }

            public void setRedemptionAmountMultiple(double RedemptionAmountMultiple) {
                this.RedemptionAmountMultiple = RedemptionAmountMultiple;
            }

            public String getRedemptionCutoffTime() {
                return RedemptionCutoffTime;
            }

            public void setRedemptionCutoffTime(String RedemptionCutoffTime) {
                this.RedemptionCutoffTime = RedemptionCutoffTime;
            }

            public String getRTAAgentCode() {
                return RTAAgentCode;
            }

            public void setRTAAgentCode(String RTAAgentCode) {
                this.RTAAgentCode = RTAAgentCode;
            }

            public String getAmcActiveFlag() {
                return AmcActiveFlag;
            }

            public void setAmcActiveFlag(String AmcActiveFlag) {
                this.AmcActiveFlag = AmcActiveFlag;
            }

            public String getDividendReinvestmentFlag() {
                return DividendReinvestmentFlag;
            }

            public void setDividendReinvestmentFlag(String DividendReinvestmentFlag) {
                this.DividendReinvestmentFlag = DividendReinvestmentFlag;
            }

            public String getSipFlag() {
                return SipFlag;
            }

            public void setSipFlag(String SipFlag) {
                this.SipFlag = SipFlag;
            }

            public String getStpFlag() {
                return StpFlag;
            }

            public void setStpFlag(String StpFlag) {
                this.StpFlag = StpFlag;
            }

            public String getSwpFlag() {
                return SwpFlag;
            }

            public void setSwpFlag(String SwpFlag) {
                this.SwpFlag = SwpFlag;
            }

            public String getSwitchFlag() {
                return SwitchFlag;
            }

            public void setSwitchFlag(String SwitchFlag) {
                this.SwitchFlag = SwitchFlag;
            }

            public String getSettlementType() {
                return SettlementType;
            }

            public void setSettlementType(String SettlementType) {
                this.SettlementType = SettlementType;
            }

            public String getFaceValue() {
                return FaceValue;
            }

            public void setFaceValue(String FaceValue) {
                this.FaceValue = FaceValue;
            }

            public String getStartDate() {
                return StartDate;
            }

            public void setStartDate(String StartDate) {
                this.StartDate = StartDate;
            }

            public String getEndDate() {
                return EndDate;
            }

            public void setEndDate(String EndDate) {
                this.EndDate = EndDate;
            }

            public String getExitLoadFlag() {
                return ExitLoadFlag;
            }

            public void setExitLoadFlag(String ExitLoadFlag) {
                this.ExitLoadFlag = ExitLoadFlag;
            }

            public String getExitLoad() {
                return ExitLoad;
            }

            public void setExitLoad(String ExitLoad) {
                this.ExitLoad = ExitLoad;
            }

            public String getLockinPeriodFlag() {
                return LockinPeriodFlag;
            }

            public void setLockinPeriodFlag(String LockinPeriodFlag) {
                this.LockinPeriodFlag = LockinPeriodFlag;
            }

            public String getLockinPeriod() {
                return LockinPeriod;
            }

            public void setLockinPeriod(String LockinPeriod) {
                this.LockinPeriod = LockinPeriod;
            }

            public String getChannelPartnerCode() {
                return ChannelPartnerCode;
            }

            public void setChannelPartnerCode(String ChannelPartnerCode) {
                this.ChannelPartnerCode = ChannelPartnerCode;
            }

            public int getActive() {
                return Active;
            }

            public void setActive(int Active) {
                this.Active = Active;
            }
        }

        public static class SipDetailsBean {
            /**
             * id : 7779
             * FundId_id : 17
             * AmcCode : KOTAKMAHINDRAMF
             * AmcName : KOTAK MAHINDRA MUTUAL FUND
             * SchemeCode : KO04D-DP
             * SchemeName : KOTAK EQUITY HYBRID - DIRECT PLAN - PAYOUT
             * SipTransactionMode : DP
             * SipFrequency : MONTHLY
             * SipDates : 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30
             * SipMinGap : 0
             * SipMaxGap : 60
             * SipInstallmentGap : 0
             * SipStatus : 1
             * SipMinInstallmentAmount : 1000
             * SipMaxInstallmentAmount : 999999999
             * SipMultiplierAmount : 1
             * SipMinInstallmentNumbers : 6
             * SipMaxInstallmentNumbers : 9999
             * Isin : INF174K01LL7
             * SchemeType : Hybrid
             * Active : 1
             */

            private int id;
            private int FundId_id;
            private String AmcCode;
            private String AmcName;
            private String SchemeCode;
            private String SchemeName;
            private String SipTransactionMode;
            private String SipFrequency;
            private String SipDates;
            private String SipMinGap;
            private String SipMaxGap;
            private String SipInstallmentGap;
            private String SipStatus;
            private int SipMinInstallmentAmount;
            private int SipMaxInstallmentAmount;
            private int SipMultiplierAmount;
            private int SipMinInstallmentNumbers;
            private int SipMaxInstallmentNumbers;
            private String Isin;
            private String SchemeType;
            private int Active;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getFundId_id() {
                return FundId_id;
            }

            public void setFundId_id(int FundId_id) {
                this.FundId_id = FundId_id;
            }

            public String getAmcCode() {
                return AmcCode;
            }

            public void setAmcCode(String AmcCode) {
                this.AmcCode = AmcCode;
            }

            public String getAmcName() {
                return AmcName;
            }

            public void setAmcName(String AmcName) {
                this.AmcName = AmcName;
            }

            public String getSchemeCode() {
                return SchemeCode;
            }

            public void setSchemeCode(String SchemeCode) {
                this.SchemeCode = SchemeCode;
            }

            public String getSchemeName() {
                return SchemeName;
            }

            public void setSchemeName(String SchemeName) {
                this.SchemeName = SchemeName;
            }

            public String getSipTransactionMode() {
                return SipTransactionMode;
            }

            public void setSipTransactionMode(String SipTransactionMode) {
                this.SipTransactionMode = SipTransactionMode;
            }

            public String getSipFrequency() {
                return SipFrequency;
            }

            public void setSipFrequency(String SipFrequency) {
                this.SipFrequency = SipFrequency;
            }

            public String getSipDates() {
                return SipDates;
            }

            public void setSipDates(String SipDates) {
                this.SipDates = SipDates;
            }

            public String getSipMinGap() {
                return SipMinGap;
            }

            public void setSipMinGap(String SipMinGap) {
                this.SipMinGap = SipMinGap;
            }

            public String getSipMaxGap() {
                return SipMaxGap;
            }

            public void setSipMaxGap(String SipMaxGap) {
                this.SipMaxGap = SipMaxGap;
            }

            public String getSipInstallmentGap() {
                return SipInstallmentGap;
            }

            public void setSipInstallmentGap(String SipInstallmentGap) {
                this.SipInstallmentGap = SipInstallmentGap;
            }

            public String getSipStatus() {
                return SipStatus;
            }

            public void setSipStatus(String SipStatus) {
                this.SipStatus = SipStatus;
            }

            public int getSipMinInstallmentAmount() {
                return SipMinInstallmentAmount;
            }

            public void setSipMinInstallmentAmount(int SipMinInstallmentAmount) {
                this.SipMinInstallmentAmount = SipMinInstallmentAmount;
            }

            public int getSipMaxInstallmentAmount() {
                return SipMaxInstallmentAmount;
            }

            public void setSipMaxInstallmentAmount(int SipMaxInstallmentAmount) {
                this.SipMaxInstallmentAmount = SipMaxInstallmentAmount;
            }

            public int getSipMultiplierAmount() {
                return SipMultiplierAmount;
            }

            public void setSipMultiplierAmount(int SipMultiplierAmount) {
                this.SipMultiplierAmount = SipMultiplierAmount;
            }

            public int getSipMinInstallmentNumbers() {
                return SipMinInstallmentNumbers;
            }

            public void setSipMinInstallmentNumbers(int SipMinInstallmentNumbers) {
                this.SipMinInstallmentNumbers = SipMinInstallmentNumbers;
            }

            public int getSipMaxInstallmentNumbers() {
                return SipMaxInstallmentNumbers;
            }

            public void setSipMaxInstallmentNumbers(int SipMaxInstallmentNumbers) {
                this.SipMaxInstallmentNumbers = SipMaxInstallmentNumbers;
            }

            public String getIsin() {
                return Isin;
            }

            public void setIsin(String Isin) {
                this.Isin = Isin;
            }

            public String getSchemeType() {
                return SchemeType;
            }

            public void setSchemeType(String SchemeType) {
                this.SchemeType = SchemeType;
            }

            public int getActive() {
                return Active;
            }

            public void setActive(int Active) {
                this.Active = Active;
            }
        }

        public static class BearishReturnsBean {
            /**
             * fiveYear : 9.33
             * threeYear : 7.54
             * oneYear : -10.32
             */

            private double fiveYear;
            private double threeYear;
            private double oneYear;

            public double getFiveYear() {
                return fiveYear;
            }

            public void setFiveYear(double fiveYear) {
                this.fiveYear = fiveYear;
            }

            public double getThreeYear() {
                return threeYear;
            }

            public void setThreeYear(double threeYear) {
                this.threeYear = threeYear;
            }

            public double getOneYear() {
                return oneYear;
            }

            public void setOneYear(double oneYear) {
                this.oneYear = oneYear;
            }
        }

        public static class ProjectedReturnsBean {
            /**
             * fiveYear : 10.34
             * threeYear : 10.34
             * oneYear : 10.34
             */

            private double fiveYear;
            private double threeYear;
            private double oneYear;

            public double getFiveYear() {
                return fiveYear;
            }

            public void setFiveYear(double fiveYear) {
                this.fiveYear = fiveYear;
            }

            public double getThreeYear() {
                return threeYear;
            }

            public void setThreeYear(double threeYear) {
                this.threeYear = threeYear;
            }

            public double getOneYear() {
                return oneYear;
            }

            public void setOneYear(double oneYear) {
                this.oneYear = oneYear;
            }
        }

        public static class ReturnsBean {
            /**
             * oneYear : -4.29812
             * threeYear : 12.00676
             * fiveYear : 11.57014
             */

            private double oneYear;
            private double threeYear;
            private double fiveYear;

            public double getOneYear() {
                return oneYear;
            }

            public void setOneYear(double oneYear) {
                this.oneYear = oneYear;
            }

            public double getThreeYear() {
                return threeYear;
            }

            public void setThreeYear(double threeYear) {
                this.threeYear = threeYear;
            }

            public double getFiveYear() {
                return fiveYear;
            }

            public void setFiveYear(double fiveYear) {
                this.fiveYear = fiveYear;
            }
        }

        public static class ScoresBean {
            /**
             * score : 0
             * returnScore : 6.34
             * riskScore : 4.56
             * fmScore : 6.77
             * tagReturn : Top 50
             * tagRisk : Top 50
             * rrScore : 0
             */

            private int score;
            private double returnScore;
            private double riskScore;
            private double fmScore;
            private String tagReturn;
            private String tagRisk;
            private int rrScore;

            public int getScore() {
                return score;
            }

            public void setScore(int score) {
                this.score = score;
            }

            public double getReturnScore() {
                return returnScore;
            }

            public void setReturnScore(double returnScore) {
                this.returnScore = returnScore;
            }

            public double getRiskScore() {
                return riskScore;
            }

            public void setRiskScore(double riskScore) {
                this.riskScore = riskScore;
            }

            public double getFmScore() {
                return fmScore;
            }

            public void setFmScore(double fmScore) {
                this.fmScore = fmScore;
            }

            public String getTagReturn() {
                return tagReturn;
            }

            public void setTagReturn(String tagReturn) {
                this.tagReturn = tagReturn;
            }

            public String getTagRisk() {
                return tagRisk;
            }

            public void setTagRisk(String tagRisk) {
                this.tagRisk = tagRisk;
            }

            public int getRrScore() {
                return rrScore;
            }

            public void setRrScore(int rrScore) {
                this.rrScore = rrScore;
            }
        }
    }
}
