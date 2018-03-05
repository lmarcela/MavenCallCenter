# MavenCallCenter

Esta aplicación consiste en que existe un call center donde hay 3 tipos de empleados: operador,
supervisor y director. El proceso de la atención de una llamada
telefónica en primera instancia debe ser atendida por un operador, si
no hay ninguno libre debe ser atendida por un supervisor, y de no
haber tampoco supervisores libres debe ser atendida por un director


## Documentación

Ir a https://github.com/lmarcela/MavenCallCenter/blob/master/Documentaci%C3%B3n/DOCUMENTACION.pdf


## Ejemplo de resultados de ejecución del proyecto


		----------------TEST EntranMasDe10LlamadasConcurrentes----------------
		1. Creación de empleados
		2. Creación de clientes
		Añadiendo empleados y clientes al CallCenter...
		CallCenter empezó ejecución
		pool-1-thread-1:	 Llamada # 1 atendida por Operador1 (Operador), Cliente: Cliente1, Fecha-Hora: 2018-03-04T20:57:44.901, Duración: 8 segundos.
		pool-1-thread-6:	 Llamada # 6 atendida por Supervisor6 (Supervisor), Cliente: cliente6, Fecha-Hora: 2018-03-04T20:57:44.901, Duración: 10 segundos.
		pool-1-thread-5:	 Llamada # 5 atendida por Operador5 (Operador), Cliente: cliente5, Fecha-Hora: 2018-03-04T20:57:44.901, Duración: 10 segundos.
		pool-1-thread-3:	 Llamada # 3 atendida por Operador3 (Operador), Cliente: cliente3, Fecha-Hora: 2018-03-04T20:57:44.902, Duración: 9 segundos.
		pool-1-thread-9:	 Llamada # 9 atendida por Director9 (Director), Cliente: cliente9, Fecha-Hora: 2018-03-04T20:57:44.901, Duración: 7 segundos.
		pool-1-thread-7:	 Llamada # 7 atendida por Supervisor7 (Supervisor), Cliente: cliente7, Fecha-Hora: 2018-03-04T20:57:44.902, Duración: 8 segundos.
		pool-1-thread-2:	 Llamada # 2 atendida por Operador2 (Operador), Cliente: cliente2, Fecha-Hora: 2018-03-04T20:57:44.901, Duración: 7 segundos.
		pool-1-thread-10:	 Llamada # 10 atendida por Director10 (Director), Cliente: cliente10, Fecha-Hora: 2018-03-04T20:57:44.901, Duración: 5 segundos.
		pool-1-thread-8:	 Llamada # 8 atendida por Supervisor8 (Supervisor), Cliente: cliente8, Fecha-Hora: 2018-03-04T20:57:44.901, Duración: 7 segundos.
		pool-1-thread-4:	 Llamada # 4 atendida por Operador4 (Operador), Cliente: cliente4, Fecha-Hora: 2018-03-04T20:57:44.901, Duración: 7 segundos.
		pool-1-thread-10:	 Finalizó llamada # 10, Fecha-Hora: 2018-03-04T20:57:49.903
		pool-1-thread-10:	 Llamada # 11 atendida por Director10 (Director), Cliente: Cliente11, Fecha-Hora: 2018-03-04T20:57:49.904, Duración: 9 segundos.
		pool-1-thread-2:	 Finalizó llamada # 2, Fecha-Hora: 2018-03-04T20:57:51.902
		pool-1-thread-9:	 Finalizó llamada # 9, Fecha-Hora: 2018-03-04T20:57:51.902
		pool-1-thread-2:	 Llamada # 12 atendida por Operador2 (Operador), Cliente: cliente12, Fecha-Hora: 2018-03-04T20:57:51.902, Duración: 7 segundos.
		pool-1-thread-9:	 Llamada # 13 atendida por Director9 (Director), Cliente: cliente13, Fecha-Hora: 2018-03-04T20:57:51.902, Duración: 6 segundos.
		pool-1-thread-8:	 Finalizó llamada # 8, Fecha-Hora: 2018-03-04T20:57:51.903
		pool-1-thread-4:	 Finalizó llamada # 4, Fecha-Hora: 2018-03-04T20:57:51.903
		pool-1-thread-4:	 Llamada # 15 atendida por Operador4 (Operador), Cliente: cliente15, Fecha-Hora: 2018-03-04T20:57:51.903, Duración: 5 segundos.
		pool-1-thread-8:	 Llamada # 14 atendida por Supervisor8 (Supervisor), Cliente: cliente14, Fecha-Hora: 2018-03-04T20:57:51.903, Duración: 8 segundos.
		pool-1-thread-7:	 Finalizó llamada # 7, Fecha-Hora: 2018-03-04T20:57:52.902
		pool-1-thread-1:	 Finalizó llamada # 1, Fecha-Hora: 2018-03-04T20:57:52.902
		pool-1-thread-7:	 Llamada # 16 atendida por Supervisor7 (Supervisor), Cliente: cliente16, Fecha-Hora: 2018-03-04T20:57:52.902, Duración: 8 segundos.
		pool-1-thread-1:	 Llamada # 17 atendida por Operador1 (Operador), Cliente: cliente17, Fecha-Hora: 2018-03-04T20:57:52.902, Duración: 7 segundos.
		pool-1-thread-3:	 Finalizó llamada # 3, Fecha-Hora: 2018-03-04T20:57:53.903
		pool-1-thread-3:	 Llamada # 18 atendida por Operador3 (Operador), Cliente: cliente18, Fecha-Hora: 2018-03-04T20:57:53.903, Duración: 6 segundos.
		pool-1-thread-5:	 Finalizó llamada # 5, Fecha-Hora: 2018-03-04T20:57:54.902
		pool-1-thread-6:	 Finalizó llamada # 6, Fecha-Hora: 2018-03-04T20:57:54.902
		pool-1-thread-6:	 Llamada # 20 atendida por Operador5 (Operador), Cliente: cliente20, Fecha-Hora: 2018-03-04T20:57:54.902, Duración: 10 segundos.
		pool-1-thread-5:	 Llamada # 19 atendida por Supervisor6 (Supervisor), Cliente: cliente19, Fecha-Hora: 2018-03-04T20:57:54.902, Duración: 10 segundos.
		pool-1-thread-4:	 Finalizó llamada # 15, Fecha-Hora: 2018-03-04T20:57:56.904
		pool-1-thread-4:	 Llamada # 21 atendida por Operador4 (Operador), Cliente: Cliente21, Fecha-Hora: 2018-03-04T20:57:56.904, Duración: 7 segundos.
		pool-1-thread-9:	 Finalizó llamada # 13, Fecha-Hora: 2018-03-04T20:57:57.904
		pool-1-thread-9:	 Llamada # 22 atendida por Director9 (Director), Cliente: cliente22, Fecha-Hora: 2018-03-04T20:57:57.904, Duración: 7 segundos.
		pool-1-thread-2:	 Finalizó llamada # 12, Fecha-Hora: 2018-03-04T20:57:58.903
		pool-1-thread-2:	 Llamada # 23 atendida por Operador2 (Operador), Cliente: cliente23, Fecha-Hora: 2018-03-04T20:57:58.903, Duración: 10 segundos.
		pool-1-thread-10:	 Finalizó llamada # 11, Fecha-Hora: 2018-03-04T20:57:58.905
		pool-1-thread-10:	 Llamada # 24 atendida por Director10 (Director), Cliente: cliente24, Fecha-Hora: 2018-03-04T20:57:58.905, Duración: 9 segundos.
		pool-1-thread-1:	 Finalizó llamada # 17, Fecha-Hora: 2018-03-04T20:57:59.903
		pool-1-thread-1:	 Llamada # 25 atendida por Operador1 (Operador), Cliente: cliente25, Fecha-Hora: 2018-03-04T20:57:59.903, Duración: 10 segundos.
		pool-1-thread-3:	 Finalizó llamada # 18, Fecha-Hora: 2018-03-04T20:57:59.904
		pool-1-thread-3:	 Llamada # 26 atendida por Operador3 (Operador), Cliente: cliente26, Fecha-Hora: 2018-03-04T20:57:59.904, Duración: 5 segundos.
		pool-1-thread-8:	 Finalizó llamada # 14, Fecha-Hora: 2018-03-04T20:57:59.905
		pool-1-thread-8:	 Llamada # 27 atendida por Supervisor8 (Supervisor), Cliente: cliente27, Fecha-Hora: 2018-03-04T20:57:59.905, Duración: 7 segundos.
		pool-1-thread-7:	 Finalizó llamada # 16, Fecha-Hora: 2018-03-04T20:58:00.902
		pool-1-thread-7:	 Llamada # 28 atendida por Supervisor7 (Supervisor), Cliente: cliente28, Fecha-Hora: 2018-03-04T20:58:00.902, Duración: 6 segundos.
		pool-1-thread-4:	 Finalizó llamada # 21, Fecha-Hora: 2018-03-04T20:58:03.904
		pool-1-thread-4:	 Llamada # 29 atendida por Operador4 (Operador), Cliente: cliente29, Fecha-Hora: 2018-03-04T20:58:03.904, Duración: 5 segundos.
		pool-1-thread-5:	 Finalizó llamada # 19, Fecha-Hora: 2018-03-04T20:58:04.903
		pool-1-thread-6:	 Finalizó llamada # 20, Fecha-Hora: 2018-03-04T20:58:04.903
		pool-1-thread-5:	 Llamada # 30 atendida por Supervisor6 (Supervisor), Cliente: cliente30, Fecha-Hora: 2018-03-04T20:58:04.903, Duración: 6 segundos.
		pool-1-thread-3:	 Finalizó llamada # 26, Fecha-Hora: 2018-03-04T20:58:04.904
		pool-1-thread-9:	 Finalizó llamada # 22, Fecha-Hora: 2018-03-04T20:58:04.905
		pool-1-thread-7:	 Finalizó llamada # 28, Fecha-Hora: 2018-03-04T20:58:06.903
		pool-1-thread-8:	 Finalizó llamada # 27, Fecha-Hora: 2018-03-04T20:58:06.905
		pool-1-thread-10:	 Finalizó llamada # 24, Fecha-Hora: 2018-03-04T20:58:07.906
		pool-1-thread-2:	 Finalizó llamada # 23, Fecha-Hora: 2018-03-04T20:58:08.903
		pool-1-thread-4:	 Finalizó llamada # 29, Fecha-Hora: 2018-03-04T20:58:08.904
		pool-1-thread-1:	 Finalizó llamada # 25, Fecha-Hora: 2018-03-04T20:58:09.903
		pool-1-thread-5:	 Finalizó llamada # 30, Fecha-Hora: 2018-03-04T20:58:10.903
		Llamadas finalizadas.
		----------------TEST EntraLlamadaYNoHayEmpleadoDisponible----------------
		1. Creación de empleados
		2. Creación de clientes
		Añadiendo empleados y clientes al CallCenter...
		CallCenter empezó ejecución
		pool-2-thread-1:	 Llamada # 1 atendida por Operador1 (Operador), Cliente: Cliente1, Fecha-Hora: 2018-03-04T20:58:10.905, Duración: 5 segundos.
		pool-2-thread-2:	 Llamada # 2 atendida por Operador2 (Operador), Cliente: cliente2, Fecha-Hora: 2018-03-04T20:58:10.905, Duración: 10 segundos.
		pool-2-thread-3:	 Llamada # 3 atendida por Supervisor3 (Supervisor), Cliente: cliente3, Fecha-Hora: 2018-03-04T20:58:10.905, Duración: 6 segundos.
		pool-2-thread-4:	 Llamada # 4 atendida por Director4 (Director), Cliente: cliente4, Fecha-Hora: 2018-03-04T20:58:10.905, Duración: 10 segundos.
		pool-2-thread-1:	 Finalizó llamada # 1, Fecha-Hora: 2018-03-04T20:58:15.906
		pool-2-thread-5:	 Llamada # 5 atendida por Operador1 (Operador), Cliente: cliente5, Fecha-Hora: 2018-03-04T20:58:15.906, Duración: 5 segundos.
		pool-2-thread-3:	 Finalizó llamada # 3, Fecha-Hora: 2018-03-04T20:58:16.906
		pool-2-thread-6:	 Llamada # 6 atendida por Supervisor3 (Supervisor), Cliente: cliente6, Fecha-Hora: 2018-03-04T20:58:16.906, Duración: 10 segundos.
		pool-2-thread-4:	 Finalizó llamada # 4, Fecha-Hora: 2018-03-04T20:58:20.905
		pool-2-thread-2:	 Finalizó llamada # 2, Fecha-Hora: 2018-03-04T20:58:20.905
		pool-2-thread-7:	 Llamada # 7 atendida por Director4 (Director), Cliente: cliente7, Fecha-Hora: 2018-03-04T20:58:20.905, Duración: 10 segundos.
		pool-2-thread-8:	 Llamada # 8 atendida por Operador2 (Operador), Cliente: cliente8, Fecha-Hora: 2018-03-04T20:58:20.905, Duración: 9 segundos.
		pool-2-thread-5:	 Finalizó llamada # 5, Fecha-Hora: 2018-03-04T20:58:20.906
		pool-2-thread-9:	 Llamada # 9 atendida por Operador1 (Operador), Cliente: cliente9, Fecha-Hora: 2018-03-04T20:58:20.906, Duración: 9 segundos.
		pool-2-thread-6:	 Finalizó llamada # 6, Fecha-Hora: 2018-03-04T20:58:26.907
		pool-2-thread-10:	 Llamada # 10 atendida por Supervisor3 (Supervisor), Cliente: cliente10, Fecha-Hora: 2018-03-04T20:58:26.908, Duración: 10 segundos.
		pool-2-thread-8:	 Finalizó llamada # 8, Fecha-Hora: 2018-03-04T20:58:29.906
		pool-2-thread-9:	 Finalizó llamada # 9, Fecha-Hora: 2018-03-04T20:58:29.907
		pool-2-thread-7:	 Finalizó llamada # 7, Fecha-Hora: 2018-03-04T20:58:30.906
		pool-2-thread-10:	 Finalizó llamada # 10, Fecha-Hora: 2018-03-04T20:58:36.908
		Llamadas finalizadas.
		----------------TEST PRINCIPAL----------------
		1. Creación de empleados
		2. Creación de clientes
		Añadiendo empleados y clientes al CallCenter...
		CallCenter empezó ejecución
		pool-3-thread-1:	 Llamada # 1 atendida por Operador1 (Operador), Cliente: Cliente1, Fecha-Hora: 2018-03-04T20:58:36.909, Duración: 7 segundos.
		pool-3-thread-2:	 Llamada # 2 atendida por Operador2 (Operador), Cliente: cliente2, Fecha-Hora: 2018-03-04T20:58:36.909, Duración: 6 segundos.
		pool-3-thread-3:	 Llamada # 3 atendida por Operador3 (Operador), Cliente: cliente3, Fecha-Hora: 2018-03-04T20:58:36.909, Duración: 5 segundos.
		pool-3-thread-4:	 Llamada # 4 atendida por Operador4 (Operador), Cliente: cliente4, Fecha-Hora: 2018-03-04T20:58:36.909, Duración: 10 segundos.
		pool-3-thread-5:	 Llamada # 5 atendida por Operador5 (Operador), Cliente: cliente5, Fecha-Hora: 2018-03-04T20:58:36.910, Duración: 6 segundos.
		pool-3-thread-6:	 Llamada # 6 atendida por Supervisor6 (Supervisor), Cliente: cliente6, Fecha-Hora: 2018-03-04T20:58:36.911, Duración: 5 segundos.
		pool-3-thread-9:	 Llamada # 9 atendida por Director9 (Director), Cliente: cliente9, Fecha-Hora: 2018-03-04T20:58:36.911, Duración: 5 segundos.
		pool-3-thread-8:	 Llamada # 8 atendida por Supervisor8 (Supervisor), Cliente: cliente8, Fecha-Hora: 2018-03-04T20:58:36.911, Duración: 5 segundos.
		pool-3-thread-7:	 Llamada # 7 atendida por Supervisor7 (Supervisor), Cliente: cliente7, Fecha-Hora: 2018-03-04T20:58:36.911, Duración: 9 segundos.
		pool-3-thread-10:	 Llamada # 10 atendida por Director10 (Director), Cliente: cliente10, Fecha-Hora: 2018-03-04T20:58:36.911, Duración: 10 segundos.
		pool-3-thread-3:	 Finalizó llamada # 3, Fecha-Hora: 2018-03-04T20:58:41.909
		pool-3-thread-6:	 Finalizó llamada # 6, Fecha-Hora: 2018-03-04T20:58:41.911
		pool-3-thread-8:	 Finalizó llamada # 8, Fecha-Hora: 2018-03-04T20:58:41.911
		pool-3-thread-9:	 Finalizó llamada # 9, Fecha-Hora: 2018-03-04T20:58:41.911
		pool-3-thread-2:	 Finalizó llamada # 2, Fecha-Hora: 2018-03-04T20:58:42.909
		pool-3-thread-5:	 Finalizó llamada # 5, Fecha-Hora: 2018-03-04T20:58:42.910
		pool-3-thread-1:	 Finalizó llamada # 1, Fecha-Hora: 2018-03-04T20:58:43.910
		pool-3-thread-7:	 Finalizó llamada # 7, Fecha-Hora: 2018-03-04T20:58:45.912
		pool-3-thread-4:	 Finalizó llamada # 4, Fecha-Hora: 2018-03-04T20:58:46.910
		pool-3-thread-10:	 Finalizó llamada # 10, Fecha-Hora: 2018-03-04T20:58:46.912
		Llamadas finalizadas.