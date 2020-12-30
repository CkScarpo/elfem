import React, { useState, useEffect }  from 'react';
import { useHistory } from 'react-router-dom'

import {Bar} from 'react-chartjs-2';

import api from '../../service/api';

interface IPedidos {
  ped_codigo: number;
  ped_data: Date;
  cli_codigo: number;
  ven_codigo: number;
  ven_codigo_agente: number;
  ped_tipopgto: String;
  ped_parcelas: number;
  ped_subtotal: number;
  ped_desconto: number
  ped_total: number;
  ped_dataentrega: Date;
  ped_status: String;
  ven_com: number;
  ven_com_ag: number;
  ped_obs: String;
  ped_condicao: String;
  ven_com_val: number;
  ven_com_ag_val: number;
  tp_codigo: String;
  tra_codigo: number;
  com_ven_manual: number;
  com_ag_manual: number;
  fp_codigo: number;
  ped_status_os_motivo: String;
  ped_inicio_os_data: Date;
  ped_fim_os_data: Date;
  ped_totservicos: number;
  ped_totprodutos: number;
  ped_status_os: String;
  ped_inicio_os_hora: Date;
  ped_fim_os_hora: Date;
  ped_tec_codigo: number;
  ped_desconto_perc: number;
  ped_fiscal: string;
  ped_usr: String;
  pcp_codigo: number;
  ped_cupom: String;
  ped_utiliza_credito: String;
  ped_hora: Date;
  ped_tra_fic_fob: number;
  ped_pontos_utilizado: number;
  ped_custo_produtos: number;
  ped_valor_frete: number;
  ped_outras_despesas: number;
  pc_codigo: number;
  ped_vl_ipi: number;
  ped_vl_icms_st: number;
  ped_tot_desconto: number;
  ped_ordem_compra: String;
  ped_frete_qtd_volumes: number;
  ped_frete_tipo_volumes: String;
  ped_reservado: String;
  ped_tot_lucro_reais: number;
  ped_tot_lucro_perc: number;
  ped_status_entrega: String;
  ped_troco: number;
  ped_origim: String;
  ped_app_usuario: String;
  ped_app_cod_pedido: number;
  ped_dt_ult_alt: String;
  ped_usr_usuario_finalizdou: String;
  ped_mot_cancelamento: String;
  ped_datahora_ult: Date;
  ped_cpf_consumidor: String;

}



const state = {
    labels: ['Faturamento', 'Custos/Impostos', 'Lucro Bruto' ],
    datasets: [
      {
        label: 'Rainfall',
        backgroundColor: 'rgba(75,192,192,1)',
        borderColor: 'rgba(0,0,0,1)',
        borderWidth: 2,
        data: [
          "faturamento"
        ]
      }
    ]
  }

const Home: React.FC = () => {
  
  const [pedidos, setPedidos] = useState<IPedidos[]>([])
  const history = useHistory()

  useEffect(() => {
    loadPedidos()
  }, []) 

  async function loadPedidos() {
    
    const response = await api.get('/pedidos')
    console.log(response)
    setPedidos(response.data)

  }
  
  const apis = api.get('/pedidos');
  let faturamento;
  for (let i = 0; i < 420; i++) {

    faturamento =+ apis;
  }
  console.log(faturamento);



    return (
        <div>
        <Bar
            data={state}
            options={{
            title:{
                display:true,
                text:'Average Rainfall per month',
                fontSize:20
            },
            legend:{
                display:true,
                position:'right'
            }
            }}
        />
        </div>
    );
}

export default Home;