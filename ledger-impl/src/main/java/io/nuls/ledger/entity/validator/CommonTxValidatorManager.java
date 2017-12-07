package io.nuls.ledger.entity.validator;

import io.nuls.core.chain.manager.TransactionValidatorManager;

/**
 * @author Niels
 * @date 2017/12/7
 */
public class CommonTxValidatorManager {

    public static void initTxValidators(){
        TransactionValidatorManager.addTxDefValidator(new UtxoTxInputsValidator());
        TransactionValidatorManager.addTxDefValidator(new UtxoTxOutputsValidator());
    }
}