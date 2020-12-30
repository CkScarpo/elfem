package br.com.elfem.luiz.elfem.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PEDIDOS")
public class Pedidos implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private long ped_codigo;

    private String ped_data;

    private Integer cli_codigo;

    private Integer ven_codigo;

    private Integer ven_codigo_agente;

    private String ped_tipopgto;

    private Integer ped_parcelas;

    private BigDecimal ped_subtotal;

    private BigDecimal ped_desconto;

    private BigDecimal ped_total;

    private String ped_dataentrega;

    private String ped_status;

    private BigDecimal ven_com;

    private BigDecimal ven_com_ag;

    private String ped_obs;

    private String ped_condicao;

    private BigDecimal ven_com_val;

    private BigDecimal ven_com_ag_val;

    private String tp_codigo;

    private Integer tra_codigo;

    private Integer com_ven_manual;

    private Integer com_ag_manual;

    private Integer fp_codigo;

    private String ped_status_os_motivo;

    private String ped_inicio_os_data;

    private String ped_fim_os_data;

    private BigDecimal ped_totservicos;

    private BigDecimal ped_totprodutos;

    private String ped_status_os;

    private String ped_inicio_os_hora;

    private String ped_fim_os_hora;

    private Integer ped_tec_codigo;

    private BigDecimal ped_desconto_perc;

    private String ped_fiscal;

    private String ped_usr;

    private Integer pcp_codigo;

    private String ped_cupom;

    private String ped_utiliza_credito;

    private String ped_hora;

    private Integer ped_tra_fic_fob;

    private Integer ped_pontos_utilizado;

    private BigDecimal ped_custo_produtos;

    private BigDecimal ped_valor_frete;

    private BigDecimal ped_outras_despesas;

    private Integer pc_codigo;

    private BigDecimal ped_vl_ipi;

    private BigDecimal ped_vl_icms_st;

    private BigDecimal ped_tot_desconto;

    private String ped_ordem_compra;

    private Integer ped_frete_qtd_volumes;

    private String ped_frete_tipo_volumes;

    private String ped_reservado;

    private BigDecimal ped_tot_lucro_reais;

    private BigDecimal ped_tot_lucro_perc;

    private String ped_status_entrega;

    private BigDecimal ped_troco;

    private String ped_origim;

    private String ped_app_usuario;

    private Integer ped_app_cod_pedido;

    private String ped_dt_ult_alt;

    private String ped_usr_usuario_finalizdou;

    private String ped_mot_cancelamento;

    private String ped_datahora_ult;

    private String ped_cpf_consumidor;


    public long getPed_codigo() {
        return ped_codigo;
    }

    public void setPed_codigo(long ped_codigo) {
        this.ped_codigo = ped_codigo;
    }

    public String getPed_data() {
        return ped_data;
    }

    public void setPed_data(String ped_data) {
        this.ped_data = ped_data;
    }

    public Integer getCli_codigo() {
        return cli_codigo;
    }

    public void setCli_codigo(Integer cli_codigo) {
        this.cli_codigo = cli_codigo;
    }

    public Integer getVen_codigo() {
        return ven_codigo;
    }

    public void setVen_codigo(Integer ven_codigo) {
        this.ven_codigo = ven_codigo;
    }

    public Integer getVen_codigo_agente() {
        return ven_codigo_agente;
    }

    public void setVen_codigo_agente(Integer ven_codigo_agente) {
        this.ven_codigo_agente = ven_codigo_agente;
    }

    public String getPed_tipopgto() {
        return ped_tipopgto;
    }

    public void setPed_tipopgto(String ped_tipopgto) {
        this.ped_tipopgto = ped_tipopgto;
    }

    public Integer getPed_parcelas() {
        return ped_parcelas;
    }

    public void setPed_parcelas(Integer ped_parcelas) {
        this.ped_parcelas = ped_parcelas;
    }

    public BigDecimal getPed_subtotal() {
        return ped_subtotal;
    }

    public void setPed_subtotal(BigDecimal ped_subtotal) {
        this.ped_subtotal = ped_subtotal;
    }

    public BigDecimal getPed_desconto() {
        return ped_desconto;
    }

    public void setPed_desconto(BigDecimal ped_desconto) {
        this.ped_desconto = ped_desconto;
    }

    public BigDecimal getPed_total() {
        return ped_total;
    }

    public void setPed_total(BigDecimal ped_total) {
        this.ped_total = ped_total;
    }

    public String getPed_dataentrega() {
        return ped_dataentrega;
    }

    public void setPed_dataentrega(String ped_dataentrega) {
        this.ped_dataentrega = ped_dataentrega;
    }

    public String getPed_status() {
        return ped_status;
    }

    public void setPed_status(String ped_status) {
        this.ped_status = ped_status;
    }

    public BigDecimal getVen_com() {
        return ven_com;
    }

    public void setVen_com(BigDecimal ven_com) {
        this.ven_com = ven_com;
    }

    public BigDecimal getVen_com_ag() {
        return ven_com_ag;
    }

    public void setVen_com_ag(BigDecimal ven_com_ag) {
        this.ven_com_ag = ven_com_ag;
    }

    public String getPed_obs() {
        return ped_obs;
    }

    public void setPed_obs(String ped_obs) {
        this.ped_obs = ped_obs;
    }

    public String getPed_condicao() {
        return ped_condicao;
    }

    public void setPed_condicao(String ped_condicao) {
        this.ped_condicao = ped_condicao;
    }

    public BigDecimal getVen_com_val() {
        return ven_com_val;
    }

    public void setVen_com_val(BigDecimal ven_com_val) {
        this.ven_com_val = ven_com_val;
    }

    public BigDecimal getVen_com_ag_val() {
        return ven_com_ag_val;
    }

    public void setVen_com_ag_val(BigDecimal ven_com_ag_val) {
        this.ven_com_ag_val = ven_com_ag_val;
    }

    public String getTp_codigo() {
        return tp_codigo;
    }

    public void setTp_codigo(String tp_codigo) {
        this.tp_codigo = tp_codigo;
    }

    public Integer getTra_codigo() {
        return tra_codigo;
    }

    public void setTra_codigo(Integer tra_codigo) {
        this.tra_codigo = tra_codigo;
    }

    public Integer getCom_ven_manual() {
        return com_ven_manual;
    }

    public void setCom_ven_manual(Integer com_ven_manual) {
        this.com_ven_manual = com_ven_manual;
    }

    public Integer getCom_ag_manual() {
        return com_ag_manual;
    }

    public void setCom_ag_manual(Integer com_ag_manual) {
        this.com_ag_manual = com_ag_manual;
    }

    public Integer getFp_codigo() {
        return fp_codigo;
    }

    public void setFp_codigo(Integer fp_codigo) {
        this.fp_codigo = fp_codigo;
    }

    public String getPed_status_os_motivo() {
        return ped_status_os_motivo;
    }

    public void setPed_status_os_motivo(String ped_status_os_motivo) {
        this.ped_status_os_motivo = ped_status_os_motivo;
    }

    public String getPed_inicio_os_data() {
        return ped_inicio_os_data;
    }

    public void setPed_inicio_os_data(String ped_inicio_os_data) {
        this.ped_inicio_os_data = ped_inicio_os_data;
    }

    public String getPed_fim_os_data() {
        return ped_fim_os_data;
    }

    public void setPed_fim_os_data(String ped_fim_os_data) {
        this.ped_fim_os_data = ped_fim_os_data;
    }

    public BigDecimal getPed_totservicos() {
        return ped_totservicos;
    }

    public void setPed_totservicos(BigDecimal ped_totservicos) {
        this.ped_totservicos = ped_totservicos;
    }

    public BigDecimal getPed_totprodutos() {
        return ped_totprodutos;
    }

    public void setPed_totprodutos(BigDecimal ped_totprodutos) {
        this.ped_totprodutos = ped_totprodutos;
    }

    public String getPed_status_os() {
        return ped_status_os;
    }

    public void setPed_status_os(String ped_status_os) {
        this.ped_status_os = ped_status_os;
    }

    public String getPed_inicio_os_hora() {
        return ped_inicio_os_hora;
    }

    public void setPed_inicio_os_hora(String ped_inicio_os_hora) {
        this.ped_inicio_os_hora = ped_inicio_os_hora;
    }

    public String getPed_fim_os_hora() {
        return ped_fim_os_hora;
    }

    public void setPed_fim_os_hora(String ped_fim_os_hora) {
        this.ped_fim_os_hora = ped_fim_os_hora;
    }

    public Integer getPed_tec_codigo() {
        return ped_tec_codigo;
    }

    public void setPed_tec_codigo(Integer ped_tec_codigo) {
        this.ped_tec_codigo = ped_tec_codigo;
    }

    public BigDecimal getPed_desconto_perc() {
        return ped_desconto_perc;
    }

    public void setPed_desconto_perc(BigDecimal ped_desconto_perc) {
        this.ped_desconto_perc = ped_desconto_perc;
    }

    public String getPed_fiscal() {
        return ped_fiscal;
    }

    public void setPed_fiscal(String ped_fiscal) {
        this.ped_fiscal = ped_fiscal;
    }

    public String getPed_usr() {
        return ped_usr;
    }

    public void setPed_usr(String ped_usr) {
        this.ped_usr = ped_usr;
    }

    public Integer getPcp_codigo() {
        return pcp_codigo;
    }

    public void setPcp_codigo(Integer pcp_codigo) {
        this.pcp_codigo = pcp_codigo;
    }

    public String getPed_cupom() {
        return ped_cupom;
    }

    public void setPed_cupom(String ped_cupom) {
        this.ped_cupom = ped_cupom;
    }

    public String getPed_utiliza_credito() {
        return ped_utiliza_credito;
    }

    public void setPed_utiliza_credito(String ped_utiliza_credito) {
        this.ped_utiliza_credito = ped_utiliza_credito;
    }

    public String getPed_hora() {
        return ped_hora;
    }

    public void setPed_hora(String ped_hora) {
        this.ped_hora = ped_hora;
    }

    public Integer getPed_tra_fic_fob() {
        return ped_tra_fic_fob;
    }

    public void setPed_tra_fic_fob(Integer ped_tra_fic_fob) {
        this.ped_tra_fic_fob = ped_tra_fic_fob;
    }

    public Integer getPed_pontos_utilizado() {
        return ped_pontos_utilizado;
    }

    public void setPed_pontos_utilizado(Integer ped_pontos_utilizado) {
        this.ped_pontos_utilizado = ped_pontos_utilizado;
    }

    public BigDecimal getPed_custo_produtos() {
        return ped_custo_produtos;
    }

    public void setPed_custo_produtos(BigDecimal ped_custo_produtos) {
        this.ped_custo_produtos = ped_custo_produtos;
    }

    public BigDecimal getPed_valor_frete() {
        return ped_valor_frete;
    }

    public void setPed_valor_frete(BigDecimal ped_valor_frete) {
        this.ped_valor_frete = ped_valor_frete;
    }

    public BigDecimal getPed_outras_despesas() {
        return ped_outras_despesas;
    }

    public void setPed_outras_despesas(BigDecimal ped_outras_despesas) {
        this.ped_outras_despesas = ped_outras_despesas;
    }

    public Integer getPc_codigo() {
        return pc_codigo;
    }

    public void setPc_codigo(Integer pc_codigo) {
        this.pc_codigo = pc_codigo;
    }

    public BigDecimal getPed_vl_ipi() {
        return ped_vl_ipi;
    }

    public void setPed_vl_ipi(BigDecimal ped_vl_ipi) {
        this.ped_vl_ipi = ped_vl_ipi;
    }

    public BigDecimal getPed_vl_icms_st() {
        return ped_vl_icms_st;
    }

    public void setPed_vl_icms_st(BigDecimal ped_vl_icms_st) {
        this.ped_vl_icms_st = ped_vl_icms_st;
    }

    public BigDecimal getPed_tot_desconto() {
        return ped_tot_desconto;
    }

    public void setPed_tot_desconto(BigDecimal ped_tot_desconto) {
        this.ped_tot_desconto = ped_tot_desconto;
    }

    public String getPed_ordem_compra() {
        return ped_ordem_compra;
    }

    public void setPed_ordem_compra(String ped_ordem_compra) {
        this.ped_ordem_compra = ped_ordem_compra;
    }

    public Integer getPed_frete_qtd_volumes() {
        return ped_frete_qtd_volumes;
    }

    public void setPed_frete_qtd_volumes(Integer ped_frete_qtd_volumes) {
        this.ped_frete_qtd_volumes = ped_frete_qtd_volumes;
    }

    public String getPed_frete_tipo_volumes() {
        return ped_frete_tipo_volumes;
    }

    public void setPed_frete_tipo_volumes(String ped_frete_tipo_volumes) {
        this.ped_frete_tipo_volumes = ped_frete_tipo_volumes;
    }

    public String getPed_reservado() {
        return ped_reservado;
    }

    public void setPed_reservado(String ped_reservado) {
        this.ped_reservado = ped_reservado;
    }

    public BigDecimal getPed_tot_lucro_reais() {
        return ped_tot_lucro_reais;
    }

    public void setPed_tot_lucro_reais(BigDecimal ped_tot_lucro_reais) {
        this.ped_tot_lucro_reais = ped_tot_lucro_reais;
    }

    public BigDecimal getPed_tot_lucro_perc() {
        return ped_tot_lucro_perc;
    }

    public void setPed_tot_lucro_perc(BigDecimal ped_tot_lucro_perc) {
        this.ped_tot_lucro_perc = ped_tot_lucro_perc;
    }

    public String getPed_status_entrega() {
        return ped_status_entrega;
    }

    public void setPed_status_entrega(String ped_status_entrega) {
        this.ped_status_entrega = ped_status_entrega;
    }

    public BigDecimal getPed_troco() {
        return ped_troco;
    }

    public void setPed_troco(BigDecimal ped_troco) {
        this.ped_troco = ped_troco;
    }

    public String getPed_origim() {
        return ped_origim;
    }

    public void setPed_origim(String ped_origim) {
        this.ped_origim = ped_origim;
    }

    public String getPed_app_usuario() {
        return ped_app_usuario;
    }

    public void setPed_app_usuario(String ped_app_usuario) {
        this.ped_app_usuario = ped_app_usuario;
    }

    public Integer getPed_app_cod_pedido() {
        return ped_app_cod_pedido;
    }

    public void setPed_app_cod_pedido(Integer ped_app_cod_pedido) {
        this.ped_app_cod_pedido = ped_app_cod_pedido;
    }

    public String getPed_dt_ult_alt() {
        return ped_dt_ult_alt;
    }

    public void setPed_dt_ult_alt(String ped_dt_ult_alt) {
        this.ped_dt_ult_alt = ped_dt_ult_alt;
    }

    public String getPed_usr_usuario_finalizdou() {
        return ped_usr_usuario_finalizdou;
    }

    public void setPed_usr_usuario_finalizdou(String ped_usr_usuario_finalizdou) {
        this.ped_usr_usuario_finalizdou = ped_usr_usuario_finalizdou;
    }

    public String getPed_mot_cancelamento() {
        return ped_mot_cancelamento;
    }

    public void setPed_mot_cancelamento(String ped_mot_cancelamento) {
        this.ped_mot_cancelamento = ped_mot_cancelamento;
    }

    public String getPed_datahora_ult() {
        return ped_datahora_ult;
    }

    public void setPed_datahora_ult(String ped_datahora_ult) {
        this.ped_datahora_ult = ped_datahora_ult;
    }

    public String getPed_cpf_consumidor() {
        return ped_cpf_consumidor;
    }

    public void setPed_cpf_consumidor(String ped_cpf_consumidor) {
        this.ped_cpf_consumidor = ped_cpf_consumidor;
    }


}
